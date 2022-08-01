// package com.spring.uchugmae;


// import static org.junit.jupiter.api.Assertions.assertEquals;

// import java.util.List;

// import org.junit.jupiter.api.Test;
// import org.junit.jupiter.api.extension.ExtendWith;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.test.context.ContextConfiguration;
// import org.springframework.test.context.junit.jupiter.SpringExtension;

// import com.spring.uchugmae.repo.UserRepositroy;
// import com.spring.uchugmae.entity.User;



// @ContextConfiguration
// @ExtendWith(SpringExtension.class)
// @SpringBootTest
// public class UserRepositoryTest {

//     @Autowired
//     private UserRepositroy userRepositroy;

//     // @Test
//     // public void save() throws Exception{
//     //     User user = new User();
//     //     user.setId("seok");
//     //     user.setName("12");
 
//     //     User result = userRepositroy.save(user);

//     //     assertEquals("seok", result.getId());
//     //     assertEquals("12", result.getName());
//     //     // userRepositroy.save(user);
//     // }
    



//     @Test
//     public void insert(){
//         String id = "권혁재";
//         String name = '권혁재';
//         userRepositroy.save(User.builder()
//             .id(id)
//             .name(name)
//             .build());
//     }
// }



//     @Test
//     public void select(){
//         String id = "권혁재";
//         String name = "권혁재";

//         userRepositroy.save(User.builder().id(id).name(name).build());

//         List<User> userList = userRepositroy.findAll();

//         User user = userList.get(0);
//         assertThat
//     }