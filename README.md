# restSpring
# Service Layer
- will be between the controller and the DAO
- Service Facade design pattern
- Intermediate layer for custom business logic
- Integrate data from multiple sources (DAO/repositories)
- `@Service` is applied to Service Implementations
- no need to add `@Transactional` as it will be handled in service layer
# RequestBody
- `@RequestBody` can be used to store the request body, it'll be mapped to the given entity

# Spring Data JPA
- Spring Data JPA `spring-data-jpa` add it in pom
- create a DAO and just plug in your entity type and primary key
- Spring will give CRUD implementation automatically
# JpaRepository
- spring data JPA provides the interface: `JpaRespository`
- we need to extend the interface with `JpaRepository<Entity_name, DataType>`
- exposes methods 
- Extend JpaRepository interface
- no need for implementation class
# Spring Data Rest
- we can delete the rest and serivces
- we need entity, JpaRepository, Maven POM dependency
- add `spring-boot-starter-data-rest` in pom.xml
- endpoint is provided for free
- spring data rest endpoints are HATEOAS complaint
  - HATEOAS: Hypermedia as the Engine of Application State
- Hypermedia-driven sites provide information to access REST interfaces
  - meta-data for rest data
- Spring data rest response using HATEOAS
- for a collection, meta-data includes page size, total elements, pages etc.
- HATEOAS uses `Hypertext Application Language(HAL)` data format
- we can see after commenting out all the DAO and implementation and the rest controller it still runs
- to give path `spring.data.rest.base-path=/magic-api` in application property
# Spring data REST Configs
- 
