# Type Inference

### 1. As the name suggests, you can use it only for local variables.

### 2. Local type inference cannot be used for variables with no initializers
   
#### Case 1:

`var xyz = null;`

(variable initializer is 'null')

#### Case 2:

`var xyz;`

(cannot use 'val' on variable without initializer)

#### Case 3:

`var xyz = () -> { };`

(lambda expression needs an explicit target-type)

### 3. Var can not used to instantiate multiple variables on same line

More details can be found here Suggested by null pointer

var X=10,Y=20,Z=30 // this is not allowed

### 4: Var as Parameters

#### 4.1 var would not be available for method parameters.

#### 4.2 Var would not be available for constructor parameters.

#### 4.3 Var would not be available for method return types.

#### 4.4 Var would not be available for catch parameters.

### 5. Array initializer is not allowed More details can by found here Suggested by Nicolai

`var k = { 1 , 2 };`
 
(array initializer needs an explicit target-type)

### 6. Method reference is not allowed

`var someVal = this::getName;`  

error: cannot infer type for local variable nameFetcher
(method reference needs an explicit target-type)
