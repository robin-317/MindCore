package com.heima.chickenhousebackend.mapper;

import com.heima.chickenhousebackend.pojo.Like;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface LikeMapper {

    //是否点赞和收藏
    @Select("select is_like,is_star from `like` where user_id = #{userId} and type=#{type} and to_like_id = #{toLikeId}")
    Like starAndLike(Like like);

    //初始化点赞/收藏数据
    @Insert("insert into `like` (type,to_like_id,user_id) values (#{type},#{toLikeId},#{userId})")
    void init(Like like);

    //点赞视频
    @Update("UPDATE video v\n" +
            "JOIN `like` l ON v.id = l.to_like_id\n" +
            "SET v.like_count = v.like_count + 1,\n" +
            "    l.is_like = 1\n" +
            "WHERE l.user_id = #{userId} \n" +
            "  AND l.type = #{type} \n" +
            "  AND l.to_like_id = #{toLikeId}\n" +
            "  AND v.id = #{toLikeId}\n"+
            "  AND l.is_like = 0 ")
    void addLike(Like like);
    //收藏视频
    @Update("UPDATE video v\n" +
            "JOIN `like` l ON v.id = l.to_like_id\n" +
            "SET v.start = v.start + 1,\n" +
            "    l.is_star = 1\n" +
            "WHERE l.user_id = #{userId} \n" +
            "  AND l.type = #{type} \n" +
            "  AND l.to_like_id = #{toLikeId}\n" +
            "  AND v.id = #{toLikeId}\n"+
            "  AND l.is_star = 0 ")
    void addStart(Like like);
    //添加到视频收藏列表
    @Insert("insert into videoStarList (video_id,user_id,starTime) " +
            "SELECT #{toLikeId}, #{userId}, current_time " +
            "FROM `like` l " +
            "WHERE l.user_id = #{userId} AND l.is_star = 0 " +
            "LIMIT 1")
    void addToStarList(Like like);


    //文章点赞
    @Update("UPDATE post v\n" +
            "JOIN `like` l ON v.id = l.to_like_id\n" +
            "SET v.like_count = v.like_count + 1,\n" +
            "    l.is_like = 1\n" +
            "WHERE l.user_id = #{userId} \n" +
            "  AND l.type = #{type} \n" +
            "  AND l.to_like_id = #{toLikeId}\n" +
            "  AND v.id = #{toLikeId}\n"+
            "  AND l.is_like = 0 ")
    void addLikePassage(Like like);
    //收藏文章
    @Update("UPDATE post v\n" +
            "JOIN `like` l ON v.id = l.to_like_id\n" +
            "SET v.start = v.start + 1,\n" +
            "    l.is_star = 1\n" +
            "WHERE l.user_id = #{userId} \n" +
            "  AND l.type = #{type} \n" +
            "  AND l.to_like_id = #{toLikeId}\n" +
            "  AND v.id = #{toLikeId}\n"+
            "  AND l.is_star = 0 ")
    void addStartPassage(Like like);
    //添加到文章收藏列表
    @Insert("insert into passageStarList (passage_id,user_id,starTime) " +
            "SELECT #{toLikeId}, #{userId}, current_time " +
            "FROM `like` l " +
            "WHERE l.user_id = #{userId} AND l.is_star = 0 " +
            "LIMIT 1")
    void addToPassageList(Like like);

    //点赞问题
    @Update("Update question q\n" +
            "JOIN `like` l ON q.id = l.to_like_id\n" +
            "SET q.like_count = q.like_count+1,\n" +
            "l.is_like=1\n" +
            "WHERE l.user_id = #{userId}\n" +
            "and l.to_like_id = #{toLikeId}\n" +
            "and q.id=#{toLikeId}\n" +
            "and l.is_like = 0" )
    void addLikeProblem(Like like);
    //收藏问题
    @Update("Update question q\n" +
            "JOIN `like` l ON q.id = l.to_like_id\n" +
            "SET q.star_count = q.star_count+1,\n" +
            "l.is_star=1\n" +
            "WHERE l.user_id = #{userId}\n" +
            "and l.to_like_id = #{toLikeId}\n" +
            "and q.id=#{toLikeId}\n" +
            "and l.is_star = 0")
    void addStartProblem(Like like);
    //添加到问题收藏列表
    @Insert("INSERT INTO problemStarList (problem_id, user_id, starTime) " +
            "SELECT #{toLikeId}, #{userId}, current_time " +
            "FROM `like` l " +
            "WHERE l.user_id = #{userId} AND l.is_star = 0 " +
            "LIMIT 1")
    void addToProblemList(Like like);
}
