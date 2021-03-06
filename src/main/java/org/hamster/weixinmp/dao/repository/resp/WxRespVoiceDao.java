/**
 * 
 */
package org.hamster.weixinmp.dao.repository.resp;

import org.hamster.weixinmp.dao.entity.resp.WxRespVoiceEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


/**
 * @author honey.zhao@aliyun.com
 * @version Jul 28, 2013
 *
 */
@Repository
public interface WxRespVoiceDao extends PagingAndSortingRepository<WxRespVoiceEntity, Long> {
}
