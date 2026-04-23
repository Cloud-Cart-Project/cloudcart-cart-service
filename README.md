# 🛒 CloudCart Cart Service

The Shopping Cart service for the CloudCart E-commerce platform. It manages persistent, per-user shopping carts.

## 🛠️ Tech Stack
*   **Framework:** Spring Boot 3.4
*   **Database:** PostgreSQL (uses `cart_db`)
*   **ORM:** Spring Data JPA / Hibernate
*   **Security:** JWT Validation (Stateless)

## 🎯 Responsibilities
*   **Cart Persistence:** Stores cart items (`productId` and `quantity`) linked to the authenticated user's username.
*   **Item Management:** Allows users to add items to their cart.
*   **Cart Lifecycle:** The cart is designed to be cleared automatically by the Order Service upon successful checkout.

*Note: This service only stores references to products (`productId`). Full product details are fetched on demand by the frontend or order service.*

## 📡 API Endpoints

| Method | Endpoint | Auth Required | Description |
| :--- | :--- | :--- | :--- |
| `GET` | `/cart` | Yes (JWT) | Retrieve the current user's cart |
| `POST` | `/cart/add` | Yes (JWT) | Add an item to the cart (`productId`, `quantity`) |
| `DELETE` | `/cart/clear` | Yes (JWT) | Empty the current user's cart |

## 🚀 Running Locally

### Prerequisites
*   Java 17+
*   Maven
*   PostgreSQL running locally (with `cart_db` created)

### Environment Variables
You must set the `JWT_SECRET` environment variable to match the one used by the Auth Service.

```bash
export JWT_SECRET=your-super-secret-key-minimum-32-chars
mvn spring-boot:run
```

## 🐳 Docker

```bash
docker build -t cloudcart-cart-service:v1.0.0 .
```
