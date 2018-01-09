package chencheng.bwie.com.shixuntwo_jd.net;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by dell on 2018/1/8.
 */

public interface ServerApi {
    //登录
    @GET("user/login")
    Flowable<Object> login(@Query("mobile") String phone,@Query("password")String pwd);
    //注册
    @GET("user/reg")
    Flowable<Object> regsinter(@Query("mobile") String phone,@Query("password")String pwd);

}
