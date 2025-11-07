package com.heima.chickenhousebackend.mapper;

import com.heima.chickenhousebackend.pojo.*;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CommentMapper {

    //获取根评论的评论列表
    @Select("select * from comment_video where parent_id is null and video_id = #{pageVideoComment.videoId} limit #{start},#{pageVideoComment.pageSize}")
    List<CommentVideo> pageVC(Integer start, PageVideoComment pageVideoComment);
    @Select("SELECT COUNT(*) \n" +
            "FROM comment_video c \n" +
            "LEFT JOIN video v ON c.video_id = v.id \n" +
            "WHERE c.parent_id IS NULL;\n")
    Long count();

    //根据父评论id和所属视频id查询子评论
    @Select("select * from comment_video where parent_id=#{parentId} and root_comment_id = #{rootCommentId} and video_id = #{videoId}")
    List<CommentVideo> getChildren(CommentVideo commentVideo);

    //根据根/父/视频id查询评论信息
    @Select("select * from comment_video where root_comment_id = #{rootCommentId} and parent_id = #{parentId} and video_id = #{videoId}")
    CommentVideo getById(CommentVideo commentVideo);

    //发布评论信息
    @Insert("insert into comment_video (comment,root_comment_id,parent_id,parent_name,role_name,user_img,video_id) " +
            "values (#{comment},#{rootCommentId},#{parentId},#{parentName},#{roleName},#{userImg},#{videoId})")
    void addComment(CommentVideo commentVideo);

    //分页获取文章顶层评论信息
    @Select("select count(*) \n" +
            "from comment_passage cp \n" +
            "left join post p on cp.passage_id = p.id \n" +
            "where cp.parent_id is null ")
    Long countP();
    @Select("select * from comment_passage where parent_id is null and passage_id = #{pagePassageComment.passageId} limit #{start},#{pagePassageComment.pageSize}")
    List<CommentPassage> getTopPassageComment(Integer start, PagePassageComment pagePassageComment);

    //根据父评论id和所属文章id查询子评论列表
    @Select("select * from comment_passage where parent_id=#{parentId} and root_comment_id = #{rootCommentId} and passage_id = #{passageId}")
    List<CommentPassage> getChildrenPassage(CommentPassage commentPassage);

    //发布文章评论信息
    @Insert("insert into comment_passage (comment,root_comment_id,parent_id,parent_name,role_name,user_img,passage_id) " +
            "values (#{comment},#{rootCommentId},#{parentId},#{parentName},#{roleName},#{userImg},#{passageId})")
    void addCommentPassage(CommentPassage commentPassage);

    //分页获取问题顶层评论信息
    @Select("select count(*) from comment_problem cq left join question q on cq.problem_id = q.id where cq.parent_id is null")
    Long countProblem();
    @Select("select * from comment_problem where parent_id is null and problem_id=#{pageProblemComment.problemId} limit #{start},#{pageProblemComment.pageSize}")
    List<CommentProblem> pageProblem(Integer start, PageProblemComment pageProblemComment);

    //发布问题评论
    @Insert("insert into comment_problem (comment,root_comment_id,parent_id,parent_name,role_name,user_img,problem_id)\n" +
            "values (#{comment},#{rootCommentId},#{parentId},#{parentName},#{roleName},#{userImg},#{problemId})")
    void addCommentProblem(CommentProblem commentProblem);

    //根据父评论id和所属问题id查询子评论
    @Select("select * from comment_problem where parent_id=#{parentId} and root_comment_id = #{rootCommentId} and problem_id = #{problemId}")
    List<CommentProblem> getChildrenProblem(CommentProblem commentProblem);
}
