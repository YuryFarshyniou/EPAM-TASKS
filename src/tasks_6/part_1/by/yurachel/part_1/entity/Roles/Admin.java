package tasks_6.part_1.by.yurachel.part_1.entity.Roles;

import java.util.ArrayList;
import java.util.List;

public class Admin {
    private List<User>userList;

    {
        userList = new ArrayList<>();
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }


}
