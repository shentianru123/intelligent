package com.share.intelligent.service;

import com.share.intelligent.entity.CommentReplyEB;

import java.util.List;

public interface CommentReplyService {

    List<CommentReplyEB>  queryAll(int articleId);

    Integer reply(CommentReplyEB eb);
}
