package com.ctyl.blog.repository;

import com.ctyl.blog.domain.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class UserRepositoryImpl  implements UserRepository{
    //存储用户数据
    private final ConcurrentMap<Long,User> userMap=new ConcurrentHashMap<>();
    //标识用户id，每增加一个user，counter会自增
    private static AtomicLong counter=new AtomicLong();
    @Override
    public User saveOrUpdateUSer(User user) {
        Long id=user.getId();
        if (id==null){//id不存在，新建用户，save
            id=counter.incrementAndGet();
            user.setId(id);
        }
        this.userMap.put(id,user);
        return user;
    }

    @Override
    public void deleteUser(Long id) {
        this.userMap.remove(id);
    }

    @Override
    public User getUserById(Long id) {

        return this.userMap.get(id);
    }

    @Override
    public List<User> listUsers() {
        return new ArrayList<User>(this.userMap.values()) ;
    }
}
