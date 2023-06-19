package com.example.shoppingxmall;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

// main class

public class Shopping {



}

//---------------------------------------------------------------------------------------------------Shopx--------------
//Shop
@Entity
class Shop{

 int shopId;
 String shopCategory;
 Employee shopEmployeeID;
 String shopName;
 String customers;
 String shopStatus;
 ShopOwner shopOwner;
 String leaseStatus;

 public Shop(){

 }

 public Shop(int shopId, String shopCategory, Employee shopEmployeeID, String shopName, String customers, String shopStatus, ShopOwner shopOwner, String leaseStatus) {
  this.shopId = shopId;
  this.shopCategory = shopCategory;
  this.shopEmployeeID = shopEmployeeID;
  this.shopName = shopName;
  this.customers = customers;
  this.shopStatus = shopStatus;
  this.shopOwner = shopOwner;
  this.leaseStatus = leaseStatus;
 }

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
 public int getShopId() {
  return shopId;
 }

 public void setShopId(int shopId) {
  this.shopId = shopId;
 }

 public String getShopCategory() {
  return shopCategory;
 }

 public void setShopCategory(String shopCategory) {
  this.shopCategory = shopCategory;
 }

 public Employee getShopEmployeeID() {
  return shopEmployeeID;
 }

 public void setShopEmployeeID(Employee shopEmployeeID) {
  this.shopEmployeeID = shopEmployeeID;
 }

 public String getShopName() {
  return shopName;
 }

 public void setShopName(String shopName) {
  this.shopName = shopName;
 }

 public String getCustomers() {
  return customers;
 }

 public void setCustomers(String customers) {
  this.customers = customers;
 }

 public String getShopStatus() {
  return shopStatus;
 }

 public void setShopStatus(String shopStatus) {
  this.shopStatus = shopStatus;
 }

 public ShopOwner getShopOwner() {
  return shopOwner;
 }

 public void setShopOwner(ShopOwner shopOwner) {
  this.shopOwner = shopOwner;
 }

 public String getLeaseStatus() {
  return leaseStatus;
 }

 public void setLeaseStatus(String leaseStatus) {
  this.leaseStatus = leaseStatus;
 }

 @Override
 public String toString(){ return "Shop [shopId=" + shopId + "shopCategory=" + shopCategory + "shopEmployeeID=" + shopEmployeeID + "shopName=" + shopName + "customers=" + customers + "shopStatus=" + shopStatus+ "shopOwner=" + shopOwner + "leaseStatus=" + leaseStatus +" ]"; }

 /*shopId: int
-shopCategory: String
-shopEmployeeID: Employee
-shopName: String
-customers: String
-shopStatus: String
-shopOwner: ShopOwner
-leaseStatus: String*/

}

//-------------------------------------------------------------------------------------------------------Customer-------
// Customer
class Customer {

 int id;
 String name;
 OrderDetails order_id;
 String phone;
 String email;

 public Customer(){

 }

 public Customer(int id, String name, OrderDetails order_id, String phone, String email) {
  this.id = id;
  this.name = name;
  this.order_id = order_id;
  this.phone = phone;
  this.email = email;
 }

 public int getId() {
  return id;
 }

 public void setId(int id) {
  this.id = id;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public OrderDetails getOrder_id() {
  return order_id;
 }

 public void setOrder_id(OrderDetails order_id) {
  this.order_id = order_id;
 }

 public String getPhone() {
  return phone;
 }

 public void setPhone(String phone) {
  this.phone = phone;
 }

 public String getEmail() {
  return email;
 }

 public void setEmail(String email) {
  this.email = email;
 }

 /*id : int
-name : String
-order_id : OrderDetails
-phone: String
-email: String*/

}

//----------------------------------------------------------------------------------------------------------Mallx-------
// Mall
class Mall{

 int id;
 MallAdmin mallAdmin;
 String mallName;
 String location;
 Shop Shops_id;
 String categories;

 public Mall(){

 }

 public Mall(int id, MallAdmin mallAdmin, String mallName, String location, Shop shops_id, String categories) {
  this.id = id;
  this.mallAdmin = mallAdmin;
  this.mallName = mallName;
  this.location = location;
  Shops_id = shops_id;
  this.categories = categories;
 }

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)

 public int getId() {
  return id;
 }

 public void setId(int id) {
  this.id = id;
 }

 public MallAdmin getMallAdmin() {
  return mallAdmin;
 }

 public void setMallAdmin(MallAdmin mallAdmin) {
  this.mallAdmin = mallAdmin;
 }

 public String getMallName() {
  return mallName;
 }

 public void setMallName(String mallName) {
  this.mallName = mallName;
 }

 public String getLocation() {
  return location;
 }

 public void setLocation(String location) {
  this.location = location;
 }

 public Shop getShops_id() {
  return Shops_id;
 }

 public void setShops_id(Shop shops_id) {
  Shops_id = shops_id;
 }

 public String getCategories() {
  return categories;
 }

 public void setCategories(String categories) {
  this.categories = categories;
 }
}


//-------------------------------------------------------------------------------------------------------Userx----------
//User

class User{

 int id;
 String name;
 String type;
 String password;

 public User(){

 }

 public User(int id, String name, String type, String password) {
  this.id = id;
  this.name = name;
  this.type = type;
  this.password = password;
 }

 public int getId() {
  return id;
 }

 public void setId(int id) {
  this.id = id;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public String getType() {
  return type;
 }

 public void setType(String type) {
  this.type = type;
 }

 public String getPassword() {
  return password;
 }

 public void setPassword(String password) {
  this.password = password;
 }

}

//---------------------------------------------------------------------------------------------------MallAdminx---------
// MallAdmin
class MallAdmin{

 int id;
 String name;
 String password;
 String phone;
 Mall mall;

 public MallAdmin(){

 }

 public MallAdmin(int id, String name, String password, String phone, Mall mall) {
  this.id = id;
  this.name = name;
  this.password = password;
  this.phone = phone;
  this.mall = mall;
 }

 public int getId() {
  return id;
 }

 public void setId(int id) {
  this.id = id;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public String getPassword() {
  return password;
 }

 public void setPassword(String password) {
  this.password = password;
 }

 public String getPhone() {
  return phone;
 }

 public void setPhone(String phone) {
  this.phone = phone;
 }

 public Mall getMall() {
  return mall;
 }

 public void setMall(Mall mall) {
  this.mall = mall;
 }

}

//--------------------------------------------------------------------------------------------------------shopOwnerx----
// shopOwner
class ShopOwner{

 int id;
 String name;
 String address;
 LocalDate dob;
 Shop shop_id;

 public ShopOwner(){

 }

 public ShopOwner(int id, String name, String address, LocalDate dob, Shop shop_id) {
  this.id = id;
  this.name = name;
  this.address = address;
  this.dob = dob;
  this.shop_id = shop_id;
 }

 public int getId() {
  return id;
 }

 public void setId(int id) {
  this.id = id;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public String getAddress() {
  return address;
 }

 public void setAddress(String address) {
  this.address = address;
 }

 public LocalDate getDob() {
  return dob;
 }

 public void setDob(LocalDate dob) {
  this.dob = dob;
 }

 public Shop getShop_id() {
  return shop_id;
 }

 public void setShop_id(Shop shop_id) {
  this.shop_id = shop_id;
 }

 /*
 * -id : int
-name : String
-dob : LocalDate
-address: String
-shop_id: Shop
* */

}

//-------------------------------------------------------------------------------------------------------Employeex-------
// Employee
class Employee{

 int id;
 String name;
 LocalDate dob;
 float salary;
 String address;
 String designation;
 Shop shop_id;

 public Employee(){

 }

 public Employee(int id, String name, LocalDate dob, float salary, String address, String designation, Shop shop_id) {
  this.id = id;
  this.name = name;
  this.dob = dob;
  this.salary = salary;
  this.address = address;
  this.designation = designation;
  this.shop_id = shop_id;
 }

 public int getId() {
  return id;
 }

 public void setId(int id) {
  this.id = id;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public LocalDate getDob() {
  return dob;
 }

 public void setDob(LocalDate dob) {
  this.dob = dob;
 }

 public float getSalary() {
  return salary;
 }

 public void setSalary(float salary) {
  this.salary = salary;
 }

 public String getAddress() {
  return address;
 }

 public void setAddress(String address) {
  this.address = address;
 }

 public String getDesignation() {
  return designation;
 }

 public void setDesignation(String designation) {
  this.designation = designation;
 }

 public Shop getShop_id() {
  return shop_id;
 }

 public void setShop_id(Shop shop_id) {
  this.shop_id = shop_id;
 }

 /*-id : int
-name : String
-dob : LocalDate
-salary: float
-address: String
-designation: String
-shop_id: Shop*/

}

//-------------------------------------------------------------------------------------------------------OrderDetails---
// OrderDetails
class OrderDetails{

 int id;
 LocalDateTime dateOfPurchase;
 float total;
 Customer customer_id;
 String paymentMode;
 Shop shop_id;

 public OrderDetails(){

 }

 public OrderDetails(int id, LocalDateTime dateOfPurchase, float total, Customer customer_id, String paymentMode, Shop shop_id) {
  this.id = id;
  this.dateOfPurchase = dateOfPurchase;
  this.total = total;
  this.customer_id = customer_id;
  this.paymentMode = paymentMode;
  this.shop_id = shop_id;
 }

 public int getId() {
  return id;
 }

 public void setId(int id) {
  this.id = id;
 }

 public LocalDateTime getDateOfPurchase() {
  return dateOfPurchase;
 }

 public void setDateOfPurchase(LocalDateTime dateOfPurchase) {
  this.dateOfPurchase = dateOfPurchase;
 }

 public float getTotal() {
  return total;
 }

 public void setTotal(float total) {
  this.total = total;
 }

 public Customer getCustomer_id() {
  return customer_id;
 }

 public void setCustomer_id(Customer customer_id) {
  this.customer_id = customer_id;
 }

 public String getPaymentMode() {
  return paymentMode;
 }

 public void setPaymentMode(String paymentMode) {
  this.paymentMode = paymentMode;
 }

 public Shop getShop_id() {
  return shop_id;
 }

 public void setShop_id(Shop shop_id) {
  this.shop_id = shop_id;
 }

 /*-id : int
-dateOfPurchase: LocalDateTime
-total: float
-customer_id: Customer
-paymentMode: String
-shop_id: Shop*/

}

//-----------------------------------------------------------------------------------------------------------Item-------
 //Item
class Item{

 long id;
 String name;
 LocalDate manufacturing;
 LocalDate expiry;
 float price;
 String category;

 public Item(){

 }

 public Item(long id, String name, LocalDate manufacturing, LocalDate expiry, float price, String category) {
  this.id = id;
  this.name = name;
  this.manufacturing = manufacturing;
  this.expiry = expiry;
  this.price = price;
  this.category = category;
 }

 public long getId() {
  return id;
 }

 public void setId(long id) {
  this.id = id;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public LocalDate getManufacturing() {
  return manufacturing;
 }

 public void setManufacturing(LocalDate manufacturing) {
  this.manufacturing = manufacturing;
 }

 public LocalDate getExpiry() {
  return expiry;
 }

 public void setExpiry(LocalDate expiry) {
  this.expiry = expiry;
 }

 public float getPrice() {
  return price;
 }

 public void setPrice(float price) {
  this.price = price;
 }

 public String getCategory() {
  return category;
 }

 public void setCategory(String category) {
  this.category = category;
 }

 /*-id : long
-name : String
-manufacturing : LocalDate
-expiry: LocalDate
-price: float
-category: String*/

 }