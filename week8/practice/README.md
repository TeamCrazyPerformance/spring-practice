## 8주차 연습 코드

jdk 17 버전을 사용합니다.

`//TODO`로 주석이 달린 부분을 채우면 됩니다. (Intellij 맨 아래 탭들 중 TODO가 적힌 탭을 누르면 //TODO로 주석이 된 부분들을 알려줍니다.)

테스트가 편하도록 2개의 데이터를 미리 초기화 해놨습니다.

## 기능 명세

### findAll

```java
public List<PostResponse> findAll() {}
```
findAll 메서드는 모든 포스트 데이터를 가져옵니다.
참고용이고 수정 가능합니다.

결과 예시

request
```
GET http://localhost:8080/api/post
```

response
```
[
    {
        "id": 0,
        "title": "title1",
        "content": "content1",
        "publicAccess": false
    },
    {
        "id": 1,
        "title": "title2",
        "content": "content2",
        "publicAccess": true
    }
]
```

### findById

```java
public PostResponse findById(@PathVariable Integer postId) {}
```
아이디에 해당하는 포스트 데이터를 가져옵니다.

결과 예시

request
```
GET http://localhost:8080/api/post/0
```

response
```
{
    "id": 0,
    "title": "title1",
    "content": "content1",
    "publicAccess": false
}
```

### create

```java
public Long create(@RequestBody PostRequest postRequest) {}
```
새로운 포스트 데이터를 생성합니다.

결과 예시

request
```
POST http://localhost:8080/api/post
{
    "title": "title3",
    "content": "content3",
    "publicAccess": true
}
```

response
```
{
    "id": 2
}
```

그 외에는 상황에 맞게 구현하시면 됩니다.
