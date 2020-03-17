package com.share.intelligent.dao;

import com.share.intelligent.entity.CommentReplyEB;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CommentReplyDao {

    @Select("select * from tbl_intelligent_comment_reply where article_id=#{articleId}")
    @Results(id = "CommentReplyMap",value= {
            @Result(property = "commentReplyId", column = "comment_reply_id", jdbcType= JdbcType.INTEGER,id=true),
            @Result(property = "childCommentReplyId", column = "child_comment_reply_id", jdbcType= JdbcType.INTEGER),
            @Result(property = "articleId", column = "article_id", jdbcType= JdbcType.INTEGER),
            @Result(property = "content", column = "content", jdbcType= JdbcType.VARCHAR),
            @Result(property = "anonymous", column = "anonymous", jdbcType= JdbcType.VARCHAR),
            @Result(property = "userId", column = "user_id", jdbcType= JdbcType.VARCHAR),
            @Result(property = "crtTime", column = "crt_time", jdbcType= JdbcType.TIMESTAMP)
    })
    List<CommentReplyEB> queryAll(int articleId);

    @Insert("insert into tbl_intelligent_comment_reply (child_comment_reply_id,article_id,content,anonymous,user_id) values" +
            " (#{childCommentReplyId},#{articleId},#{content},#{anonymous},#{userId})")
    int reply(CommentReplyEB eb);
}
