package amit.mycart.session

import amit.mycart.model.Response
import amit.mycart.model.User
import amit.mycart.repository.UserRepository
import amit.mycart.utils.DatabaseUtils

/**
 * Session Manager to manage user presence in whole execution of the application.
 */
object SessionManager : Session {

    private var mutableCurrentUser: User? = null
    private var mutableCurrentUserType: UserType? = null
    private val userRepository = UserRepository(DatabaseUtils.getConnection()!!)

    /**
     * Current user will be the current signed in user.
     */
    val currentUser: User?
        get() = mutableCurrentUser

    /**
     * User type might be ADMIN/USER
     */
    val currentUserType: UserType?
        get() = mutableCurrentUserType

    override fun signIn(
        type: UserType,
        username: String,
        password: String,
        callback: ((Response<*>) -> Unit)?
    ) {
        try {
            val user = userRepository.getUserByUsernameAndPassword(type, username, password)

            if (user != null) {
                mutableCurrentUser = user

                mutableCurrentUserType = when (type) {
                    UserType.USER -> UserType.USER
                    UserType.ADMIN -> UserType.ADMIN
                }

                callback?.invoke(Response.Success(mutableCurrentUser!!))
            } else {
                callback?.invoke(Response.Error<String>("Invalid Username / Password"))
            }
        } catch (e: Exception) {
            e.printStackTrace()
            callback?.invoke(Response.Error<String>("Try Again! ${e.message}"))
        }
    }

    override fun signOut() {
        mutableCurrentUser = null
        mutableCurrentUserType = null
    }
}
