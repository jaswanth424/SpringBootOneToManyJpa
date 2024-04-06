# One-to-Many relationship
- One Customer associated with many Products
- make sure database doesn't container customer,customer_seq, product, product_seq tables.
# Model
- Customer 
- Product
# Customer class
- add customer variables like id, name, city, etc
- and add @OneToMany annotation
-     @OneToMany(targetEntity = Product.class, cascade = CascadeType.ALL)
-     @JoinColumn(name = "customer_product_FK", referencedColumnName = "customer_id")
  private List<Product> products;


# Product class
- no speicfic annocations need to added here in product class.

# Request

curl --location 'http://localhost:9094/placeOrder' \
--header 'Content-Type: application/json' \
--data '{
"name":"Mohith",
"city":"Mississauga",
"products":[{
"name":"iPad"
},{
"name":"WalkieTalki"
}]

}'

# Response
{
"customer_id": 2,
"name": "Mohith",
"city": "Mississauga",
"products": [
{
"product_id": 3,
"name": "iPad"
},
{
"product_id": 4,
"name": "WalkieTalki"
}
]
}