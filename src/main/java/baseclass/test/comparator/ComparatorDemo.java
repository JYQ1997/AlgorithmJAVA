package baseclass.test.comparator;

import baseclass.test.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @Author YongQiang
 * @Date 2020/7/26 11:04
 * @Version 1.0
 */
public class ComparatorDemo implements Comparator<User> {


    @Override
    public int compare(User o1, User o2) {
        if (o1.getAge() > o2.getAge()) {
            return 1;
        } else if (o1.getAge() < o2.getAge()) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        /*
        //------------简单的比较-------------
        User jyq=new User("jyq",23);
        User xwq=new User("xwq",22);
        ComparatorDemo comparatorDemo=new ComparatorDemo();
        int compare = comparatorDemo.compare(jyq, xwq);
        System.out.println(compare);
        */

        List<User> userList = new ArrayList<>();
        userList.add(new User("jyq", 23));
        userList.add(new User("xwq", 22));
        userList.add(new User("jzp", 48));
        userList.add(new User("jml", 17));
        userList.add(new User("mll", 47));

        userList.sort(new ComparatorDemo());

        for (User user : userList) {
            System.out.println("name = " + user.getName() + ";age = " + user.getAge());
        }

    }
}
