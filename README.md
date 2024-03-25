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
