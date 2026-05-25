<p align="center">
  <img src="https://iili.io/3FFO5cF.png" alt="Universidade Católica de Brasília">
</p>

## PERSONAL PROJECT - MS-CATALOG 📚

### 📖 Description
Microservice responsible for **managing the library's book catalog**. MS-Catalog is responsible for:
- 📖 **Manage books** with information like title, ISBN, description, and base price
- ✍️ **Manage authors** of books
- 🏢 **Manage publishers** responsible for publication
- 🏷️ **Manage categories** of books for organization
- 🔍 **Search and filter** books by various criteria
- 📊 **Maintain information** on availability and status

This service is part of a microservices architecture composed of:

- [`bff-wzzy-library`](https://github.com/codewesleylima/bff-wzzy-library) – Central gateway and orchestration
- [`ms-wzzy-auth`](https://github.com/codewesleylima/ms-wzzy-auth) – Authentication and JWT token management
- [`ms-wzzy-catalog`](https://github.com/codewesleylima/ms-wzzy-catalog) – Book catalog, authors, publishers, and categories
- [`ms-wzzy-customers`](https://github.com/codewesleylima/ms-wzzy-customers) – Customer profile, address, and preference management
- [`ms-wzzy-order`](https://github.com/codewesleylima/ms-wzzy-order) – Shopping cart and order orchestration
- [`ms-wzzy-payments`](https://github.com/codewesleylima/ms-wzzy-payments) – Payment processing and gateway integration
- [`ms-wzzy-stock`](https://github.com/codewesleylima/ms-wzzy-stock) – Inventory and availability management

---

## 🔁 Catalog Flow

1. **Client** → BFF: Requests book listing or search
2. BFF → **ms-catalog**: Sends catalog request
3. **ms-catalog** → Database: Queries books, authors, publishers, and categories
4. Database → **ms-catalog**: Returns persisted data
5. **ms-catalog** → BFF: Returns list of books with complete information
6. BFF → **Client**: Displays formatted catalog

**Flow in Order:**

1. Client → BFF: Adds book to cart
2. BFF → **ms-order**: Registers item in cart
3. **ms-order** → **ms-catalog**: Validates book availability
4. **ms-catalog** → **ms-order**: Confirms availability and price
5. **ms-order** → BFF: Confirms item added to cart

---

### ⚡ Features

1. 📖 Manage books with ISBN, description, and base price
2. ✍️ Manage book authors
3. 🏢 Manage publishers
4. 🏷️ Manage book categories
5. 🔍 Search books by title, ISBN, author, or category
6. 📊 Filter books by status (active/inactive)
7. 📝 Maintain update history
8. 💰 Manage book base prices
9. 🔗 Link books, authors, publishers, and categories

---

### 🖥️ **Running Locally**

To run the project locally:

```sh
./gradlew bootRun
```

> 💡 Make sure PostgreSQL database is running and configured in `application.properties`.

---

#### 🛠️ Technologies Used

- ☕ Java 21
- 🍃 Spring Boot 3
- 📦 Spring Data JPA
- 🗄️ PostgreSQL
- 🧪 JUnit / Mockito
- 🔧 Gradle

---

### 🛺 Author

<table>
  <tr>
    <td align="center">
      <a href="https://www.linkedin.com/in/wesslima/" title="Wesley Lima">
        <img src="https://media.licdn.com/dms/image/v2/D4D03AQH8pgDMsT7zMw/profile-displayphoto-crop_800_800/B4DZs03OodH8AM-/0/1766118457145?e=1781136000&v=beta&t=-N2WNA9CWJ7Io6nX33GPNvYtFl9ZQMAM-jALLlYNGc8" width="100px;" alt="Wesley Lima Photo"/><br>
        <sub>
          <b>Wesley Lima</b>
        </sub>
      </a>
    </td>
  </tr>
</table>
