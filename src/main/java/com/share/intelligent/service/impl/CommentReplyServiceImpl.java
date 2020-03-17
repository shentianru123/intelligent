package com.share.intelligent.service.impl;

import com.share.intelligent.dao.CommentReplyDao;
import com.share.intelligent.entity.CommentReplyEB;
import com.share.intelligent.service.CommentReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentReplyServiceImpl implements CommentReplyService {

    @Autowired
    CommentReplyDao dao;

    @Override
    public List<CommentReplyEB> queryAll(int articleId) {
        return dao.queryAll(articleId);
    }

    @Override
    public Integer reply(CommentReplyEB eb) {
        return dao.reply(eb);
    }
}
