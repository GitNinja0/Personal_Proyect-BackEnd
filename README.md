# Inmobiliaria Inmovil

## Description
This web application is a personal project that replicates the functionality of a real estate sales and rental website. It aims to provide a simpler approach to property search. The application features a mail system to notify property owners, as well as functionalities for uploading, editing, and deleting properties.

Furthermore, it includes a fully functional database built with Java and Spring Boot, ensuring efficient data management and reliability.


## Screenshots

### Home
![image](https://github.com/GitNinja0/Personal_Proyect-FrontEnd/assets/146742892/140d074d-8de0-4f44-bfb4-977f5d81e784)
![image](https://github.com/GitNinja0/Personal_Proyect-FrontEnd/assets/146742892/821f3d62-6347-4af9-bab0-c4f36bacf4d0)

#### Pages

- **Sales**
![image](https://github.com/GitNinja0/Personal_Proyect-FrontEnd/assets/146742892/8665ccc5-782d-480c-9357-2518fe06d988)

- **Rents**
![image](https://github.com/GitNinja0/Personal_Proyect-FrontEnd/assets/146742892/6b370f61-9407-439f-a117-d08f6131a279)

- **Post Property**
![image](https://github.com/GitNinja0/Personal_Proyect-FrontEnd/assets/146742892/9619389b-7f21-4d26-948c-92579663bceb)
![image](https://github.com/GitNinja0/Personal_Proyect-FrontEnd/assets/146742892/f0663c12-0330-43eb-89c4-0b96304ff452)

- **Edit Property**
![image](https://github.com/GitNinja0/Personal_Proyect-FrontEnd/assets/146742892/872baec7-7ecf-4065-8b0e-2f8dd3ae0bfc)
![image](https://github.com/GitNinja0/Personal_Proyect-FrontEnd/assets/146742892/38f00c76-18d1-436f-ad5a-18a40d8a53ae)

- **Details Propery**
![image](https://github.com/GitNinja0/Personal_Proyect-FrontEnd/assets/146742892/d8d07c04-5a1a-4d10-828e-bfd61ef25ca1)
![image](https://github.com/GitNinja0/Personal_Proyect-FrontEnd/assets/146742892/3f5aea2e-1e7b-486c-aa5a-92b819747839)

## Tecnologies Used

### Frontend

- **Vue 3:** 🖼️ Framework for building user interfaces.
- **JavaScript:** 🌐 Programming language for client-side scripting.
- **Sass:** 🎨 Stylesheet language to enhance the design and structure of the project.
- **EmailJs:** ✉️ Service used for sending emails within the application.

### Backend

- **Spring Boot:** ☕ Framework for building Java-based enterprise applications.
- **Java:** ☕ Widely used programming language for enterprise-level applications.
- **MYSQL Databases:** 🗃️ Utilized for storing and managing data related to events and users.
- **Docker Containers:** 🐳 Platform for packaging, distributing, and running applications in containers.

## Run Locally Front-End

Clone the project

```bash
  git clone https://github.com/GitNinja0/Personal_Proyect-FrontEnd
```

Go to the project directory

```bash
  cd Personal_Proyect-FrontEnd
```

Install dependencies

```bash
  npm install
```

Start the server

```bash
  npm run dev
```

## Install Back-End 

Clone the project

```bash
  git clone https://github.com/GitNinja0/Personal_Proyect-BackEnd
```
Start the server
```bash
  mvn spring-boot:run
```
Start Container Docker
```bash
  docker pull mysql:8.0-debian
```
```bash
  docker run --name real-estate_db -p 3306:3306 -e MYSQL_ROOT_PASSWORD=password -d mysql:8.0-debian
```
And create Schema SQL real-estate_db



## Deployment

To deploy this project run

```bash
  npm run build
```


## Running Tests

To run tests, run the following command

```bash
  npm run test:unit
```


## Authors

- [@GitNinja0](https://github.com/GitNinja0)




