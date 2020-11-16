接口及异常处理

实验目的

1学习Java中抽象类和抽象方法的定义
2学习Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法 
3了解异常的使用方法，并在程序中根据输入情况做异常处理

实验内容

1.某学校为了给学生提供勤工俭学机会，也减轻授课教师的部分压力，准许博士研究生参与课程的助教工作。此时，该博士研究生有双重身份：学生和助教教师。 2.设计两个管理接口：学生管理接口和教师管理接口。学生接口必须包括缴纳学费、查学费的方法；教师接口包括发放薪水和查询薪水的方法。 3.设计博士研究生类，实现上述的两个接口，该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性。（其他属性及方法，可自行发挥） 4.编写测试类，并实例化至少两名博士研究生，统计他们的年收入和学费。根据两者之差，算出每名博士研究生的年应纳税金额（国家最新工资纳税标准，请自行检索）。

实验要求

1.在博士研究生类中实现各个接口定义的抽象方法; 2.对年学费和年收入进行统计，用收入减去学费，求得纳税额； 3.国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static final修饰定义。 4.实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值，也可采用Scanner类实现运行时交互式输入。 5.根据输入情况，要在程序中做异常处理。

实验过程:

先是创建一个类，在里边设置变量name number等等当作数据的输入。
之后用两个interface接口分别实现学生的student和teacher的属性构造，student定义学费金额，teacher定义工资和税率。
因为是数字类型所以均用double来定义。

在主类下用catch用作预处理，若出现错误则输出：数据异常。
最后完善主类中内容，为变量赋值，并在后面用this进行引用。
输出结果，中途出现数据异常，返回调试。
结果正常

核心代码

    public static void main(String[] args) {
        try {
            System.out.println("博士研究生：");
            Doctor hkl = new Doctor();
            hkl.setName("王美丽");
            hkl.setAge(19);
            hkl.setNumber(2000000);
            hkl.setSex("女");
            hkl.setTuition(5500);
            hkl.setSalary(1800);
            System.out.println("学生姓名:" + hkl.getName());
            System.out.println("学生年龄:" + hkl.getAge());
            System.out.println("学生编号:" + hkl.getNumber());
            System.out.println("学生性别:" + hkl.getSex());
            hkl.find_tuition();
            hkl.find_salary();
            hkl.taxation();
            System.out.println("博士研究生2：");
            Doctor zsy = new Doctor();
            zsy.setName("张依依");
            zsy.setAge(22);
            zsy.setNumber(2010310001);
            zsy.setSex("女");
            zsy.setTuition(5500);
            zsy.setSalary(2000);
            System.out.println("学生姓名:" + zsy.getName());
            System.out.println("学生年龄:" + zsy.getAge());
            System.out.println("学生编号:" + zsy.getNumber());
            System.out.println("学生性别:" + zsy.getSex());
            zsy.find_tuition();
            zsy.find_salary();
            zsy.taxation();
        } catch (Exception e) {
            System.out.println("数据异常");
        }

    }
实验结果

博士研究生1： 学生姓名:王美丽学生年龄:19 学生编号:2000000 学生性别:女 学费缴纳成功，金额为：5500.0 工资发放成功，金额为：1600.0 每年纳税额度为：2400.0 博士研究生2： 学生姓名:张一一 学生年龄:20 学生编号:2010310001 学生性别:女 学费缴纳成功，金额为：5500.0 工资发放成功，金额为：1760.0 每年纳税额度为：2880.0

实验感想

进行的这歌实验我学会了不同接口的用法，并学会了用预处理方来解决实验中的问题，最后通过不断修改完成了实验内容。
