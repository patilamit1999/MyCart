# MyCart
## 🛠 How to setup? 
- Clone this repository.
- Setup Database and Project

#### 🗄️ Database / MySQL Setup
- Open XAMPP control panel.
- Start on **Apache** and **MySQL**
- Open browser → Go to [`localhost/phpmyadmin`](http://localhost/phpmyadmin)
- Sign in with credentials.
- Select `Import` → Select File → Choose [`db/mykart.sql`](db/mykart.sql) file.
- Click `Go`.
Thus database setup is successful.

#### 💾 Project Setup 
- Open ***IntellJ Idea*** and *Import* this project.
- Configure [`Config.kt`](src/main/kotlin/dev/shreyaspatil/mycart/Config.kt) file. Replace below fields with your confiurations.
  - `DATABASE_HOST` - Database Host Address
  - `DATABASE_USERNAME` - Username of your database
  - `DATABASE_PASSWORD` - Password of your database
  - `DATABASE_NAME` - Name of your database
- ▶️ Run project with [`MyCart.kt`](src/main/kotlin/dev/shreyaspatil/mycart/MyCart.kt)

> ***When you'll run this application there you'll need to Login via user/admin account. Database already contains user accounts. You can login with below credentials***

##### 🔑 Login Credentials 

Account      | Username      | Password
------------ | ------------- | -------------
ADMIN        | `admin`       | `admin`
USER 1       | `Amit`        | `Amit`
USER 2       | `Ajit`        | `Ajit`


# Points to remember
------------------------------------------------------------------------------------------
1. Login with admin first and add category
2. Add product (you can choose product category from list)
3. Repeat above steps for number of products you want to add.
4. Do not add product directly without creating category.
5. Admin can't place orders.
6. User carts won't be visible until user adds something to his/her cart.
7. Order bills won't be visible until there is an order placed by user.
8. When user confirmed his/her order product cart will be flushed and no longer be available for admin to view.
9. When user complete his/her order checkout only then admin can view the bills generated.
10. Users can browse categories and products interactively.
11. Products can be added to the cart from product detail page only.


![mycart drawio](https://user-images.githubusercontent.com/57793374/174478922-53e5e696-cee1-4c98-8e24-51ac784e5959.png)

