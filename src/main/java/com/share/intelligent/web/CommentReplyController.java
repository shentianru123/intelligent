package com.share.intelligent.web;

import com.share.intelligent.entity.CommentReplyEB;
import com.share.intelligent.service.CommentReplyService;
import com.share.intelligent.utils.JsonResult;
import com.share.intelligent.utils.JsonResultUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import static com.share.intelligent.utils.JsonResultUtils.MSG_FAILED;

@RestController
@RequestMapping("/intelligent/CommentReply")
public class CommentReplyController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    CommentReplyService service;

    @PostMapping("/queryAll")
    public JsonResult queryAll(@RequestParam(value = "articleId") Integer articleId){
        logger.info("CommentReplyController.queryAll begin...");
        try {
            return JsonResultUtils.SUCCESS_DATA(service.queryAll(articleId));
        }catch (Exception e){
            logger.warn(e.toString());
            return JsonResultUtils.ERROR(500,MSG_FAILED);
        }finally {
            logger.info("CommentReplyController.queryAll end...");
        }

    }

    @PostMapping("/reply")
    public JsonResult reply(@RequestBody CommentReplyEB eb){
        logger.info("CommentReplyController.reply begin...");
        try {
            if(null==eb.getArticleId()|| "".equals(eb.getArticleId())){
                return JsonResultUtils.ERROR(400,"文章id不存在");
            }
            if(null==eb.getContent()|| "".equals(eb.getContent())){
                return JsonResultUtils.ERROR(400,"内容不存在");
            }
            if(null!=eb.getAnonymous()&& "Y".equals(eb.getAnonymous())){
                if(null==eb.getUserId()||"".equals(eb.getUserId())){
                    return JsonResultUtils.ERROR(400,"当不为匿名,请给用户Id");
                }
            }
            service.reply(eb);
            return JsonResultUtils.SUCCESS();
        }catch (Exception e){
            logger.warn(e.toString());
            return JsonResultUtils.ERROR(500,MSG_FAILED);
        }finally {
            logger.info("CommentReplyController.reply end...");
        }
    }

}
