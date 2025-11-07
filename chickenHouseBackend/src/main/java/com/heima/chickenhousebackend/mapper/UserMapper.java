package com.heima.chickenhousebackend.mapper;

import com.heima.chickenhousebackend.pojo.*;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    //登录
    @Select("select id ,username ,avatar,signature from user where username = #{username} and password = #{password}")
    User login(User user);

    //注册
    @Options(useGeneratedKeys = true , keyProperty = "id") //获取生成的主键--主键返回
    @Insert("INSERT INTO user (username, password) VALUES (#{username},#{password})")
    void register(User user);

    //上传视频内容
    @Insert("insert into video (user_id,video_url,image_url,title,description,create_time,like_count,start) values (#{userId},#{videoUrl},#{imageUrl},#{title},#{description},#{createTime},#{likeCount},#{start})")
    void postInformation(Video video);

    //发布文章
    @Insert("insert into post (title,type,comment,comment_img,user_id,create_time,like_count,start) values (#{title},#{type},#{comment},#{commentImg},#{userId},#{createTime},#{likeCount},#{start})")
    void postText(Post post);

    //查询部分视频
    @Select("select id,user_id,video_url,image_url,title,description,create_time,like_count,start from video limit 6")
    List<Video> listVideo();

    //查询部分文章
    @Select("select id,title,type,comment,comment_img,user_id,create_time,like_count, start from post limit 6")
    List<Post> listText();

    //根据user_id查询用户信息
    @Select("select id , username , avatar, signature from user where id = #{userId}")
    User getByUserId(Video video);

    //根据用户id查询用户信息
    @Select("select id , username , avatar, signature from user where id = #{id} ")
    User getUserInfoById(Integer id);

    //查询所有视频
    @Select("select id,user_id,video_url,image_url,title,description,create_time,like_count,start from video")
    List<Video> listVideo_1();

    //查询所有文章
    @Select("select id,title,type,comment,comment_img,user_id,create_time,like_count,start from post")
    List<Post> listText_1();

    //分页查询视频
    @Select("select id,user_id,video_url,image_url,title,description,create_time,like_count,start from video limit #{start} ,#{page.pageSize}")
    List<Video> pageVideo(Integer start,Page page);
    @Select("select count(*) from video")
    Long count1();
    //分页查询文章
    @Select("select id,title,type,comment,comment_img,user_id,create_time,like_count,start from post limit #{start} ,#{page.pageSize}")
    List<Post> pageText(Integer start, Page page);
    @Select("select count(*) from post")
    Long count();
    //分页查询问题
    @Select("select count(*) from question")
    Long count2();
    @Select("select * from question limit #{start},#{page.pageSize}")
    List<Question> pageProblem(Integer start, Page page);

    //根据id查询视频url
    @Select("select id,user_id,video_url,image_url,title,description,create_time,like_count,start from video where id = #{id}")
    Video getUrlById(Integer id);

    //返回文章、视频、问题的总数量
    @Select("SELECT \n" +
            "  (SELECT COUNT(*) FROM post where  user_id = #{id}) AS passageCount,\n" +
            "  (SELECT COUNT(*) FROM video where user_id = #{id}) AS videoCount,\n" +
            "  (SELECT COUNT(*) FROM question where user_id = #{id}) AS problemCount;\n")
    TotalCount getTotalCount(Integer id);

    //分页查询，返回每一页的数据(限定当前用户)
    @Select("select count(*) from video where user_id = #{userId}")
    Long count_1(Page page);
    @Select("select id,user_id,video_url,image_url,title,description,create_time,like_count,start from video where user_id = #{page.userId} limit #{start} ,#{page.pageSize}")
    List<Video> pageVideo_1(Integer start, Page page);
    //分页查询，返回每一页的文章(限定当前用户)
    @Select("select count(*) from post where user_id = #{userId}")
    Long count_2(Page page);
    @Select("select id,title,type,comment,comment_img,user_id,create_time,like_count,start from post where user_id=#{page.userId} limit #{start} ,#{page.pageSize}")
    List<Post> pageText_1(Integer start, Page page);
    //分页查询，返回每一页的问题(限定当前用户)
    @Select("select count(*) from question where user_id = #{userId}")
    Long count_3(Page page);
    @Select("select * from question where user_id=#{page.userId} limit #{start} ,#{page.pageSize}")
    List<Question> getUserProblem_1(Integer start, Page page);

    //修改用户信息
    void changeInfo(Integer id, User user);

    //根据id获取用户文章展示的数据
    @Select("select * from post where user_id = #{id}")
    List<Post> getUserPassage(Integer id);

    //根据id获取用户视频展示的数据
    @Select("select * from video where user_id = #{id}")
    List<Video> getUserVideo(Integer id);

    //根据id获取用户问题展示的数据
    @Select("select * from question where user_id = #{id}")
    List<Question> getUserProblem(Integer id);

    //根据用户id获取用户的文章收藏1
    @Select("select * from post p join passageStarList pSL on p.id=pSL.passage_id where pSL.user_id=#{id}")
    List<Post> getUserPassage_1(Integer id);

    //根据id获取用户的视频收藏1
    @Select("select * from video v join videoStarList vSL on v.id=vSL.video_id where vSL.user_id=#{id}")
    List<Video> getUserVideo_1(Integer id);

    //根据id获取用户的问题收藏1
    @Select("select * from question q join problemStarList pSL on q.id=pSL.problem_id where pSL.user_id=#{id}")
    List<Question> getUserQuestion_1(Integer id);

    //根据用户id查询用户收藏的数量
    @Select("select (select count(*) from videoStarList where user_id = #{id}) + " +
            "(select count(*) from passageStarList where user_id = #{id}) + " +
            "(select count(*) from problemStarList where user_id = #{id})")
    Integer getAllCount(Integer id);

    //获取所有用户
    @Select("select * from user")
    List<User> getAllUsers();


}
