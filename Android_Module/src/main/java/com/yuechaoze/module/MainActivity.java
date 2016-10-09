package com.yuechaoze.module;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        String[] names = {"ssd","22","dsa"};
//
//        Observable.from(names).subscribe(new Action1<String>() {
//            @Override
//            public void call(String s) {
//                //Toast.makeText(MainActivity.this,s,Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        final int d = R.mipmap.train_btn_check;
//
//        final ImageView testImage = (ImageView) findViewById(R.id.imageView2);
//
//
//        Observable.create(new Observable.OnSubscribe<Drawable>() {
//            @Override
//            public void call(Subscriber<? super Drawable> subscriber) {
//
//                Drawable draw = MainActivity.this.getResources().getDrawable(d);
//
//                subscriber.onNext(draw);
//                subscriber.onCompleted();
//            }
//        }).subscribe(new Observer<Drawable>() {
//            @Override
//            public void onCompleted() {
//                Toast.makeText(MainActivity.this,"dddd",Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onError(Throwable e) {
//
//            }
//
//            @Override
//            public void onNext(Drawable drawable) {
//                testImage.setBackgroundDrawable(drawable);
//            }
//        });
//
//
//        Observable.just(1,2,3,4)
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Action1<Integer>() {
//                    @Override
//                    public void call(Integer integer) {
//                        Toast.makeText(MainActivity.this,"integer : "+integer,Toast.LENGTH_SHORT).show();
//                    }
//                });
//
//        Student s1 = new Student();
//
//        List<Course> c1 = new ArrayList<>();
//        Course c11 = new Course();
//        c11.setCourseId("11");
//        c11.setCourseName("java11");
//        c1.add(c11);
//
//        Course c12 = new Course();
//        c12.setCourseId("12");
//        c12.setCourseName("java12");
//        c1.add(c12);
//
//
//        Course c13 = new Course();
//        c13.setCourseId("13");
//        c13.setCourseName("java13");
//        c1.add(c13);
//
//        s1.setCourses(c1);
//
//
//
//        Student s2 = new Student();
//
//        List<Course> c2 = new ArrayList<>();
//        Course c21 = new Course();
//        c21.setCourseId("21");
//        c21.setCourseName("java21");
//        c2.add(c21);
//
//        Course c22 = new Course();
//        c22.setCourseId("22");
//        c22.setCourseName("java22");
//        c2.add(c22);
//
//
//        Course c23 = new Course();
//        c23.setCourseId("23");
//        c23.setCourseName("java23");
//        c2.add(c23);
//
//        s2.setCourses(c2);
//
//        Student[] sts = new Student[]{s1,s2};
//
//        Subscriber<Course> subscriber = new Subscriber<Course>() {
//            @Override
//            public void onCompleted() {
//
//            }
//
//            @Override
//            public void onError(Throwable e) {
//
//            }
//
//            @Override
//            public void onNext(Course course) {
//                Log.d("couse_id : ",course.getCourseId());
//                Log.d("couse_name : ",course.getCourseName());
//            }
//        };
//
//
//        Observable.from(sts).flatMap(new Func1<Student, Observable<Course>>() {
//            @Override
//            public Observable<Course> call(Student student) {
//                return Observable.from(student.getCourses());
//            }
//        }).subscribe(subscriber);
//
//
//
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("http://192.168.31.242:8080/springmvc_users/user/")
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//        IUserBiz userBiz = retrofit.create(IUserBiz.class);
//        Call<List<User>> call = userBiz.getUsers();
//        call.enqueue(new Callback<List<User>>()
//        {
//            @Override
//            public void onResponse(Call<List<User>> call, Response<List<User>> response)
//            {
//                Log.e(TAG, "normalGet:" + response.body() + "");
//            }
//
//            @Override
//            public void onFailure(Call<List<User>> call, Throwable t)
//            {
//
//            }
//        });

    }
}
