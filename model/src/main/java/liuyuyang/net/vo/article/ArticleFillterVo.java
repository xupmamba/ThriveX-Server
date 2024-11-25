package liuyuyang.net.vo.article;

import io.swagger.annotations.ApiModelProperty;
import liuyuyang.net.vo.FilterVo;
import lombok.Data;

import java.util.List;

@Data
public class ArticleFillterVo extends FilterVo {
    @ApiModelProperty(value = "根据分类进行筛选")
    private List<Integer> cateIds;
    @ApiModelProperty(value = "根据标签进行筛选")
    private Integer tagId;
    @ApiModelProperty(value = "是否为草稿", example = "默认：0，草稿：1")
    private Integer isDraft = 0;
    @ApiModelProperty(value = "是否为严格删除", example = "默认：0，严格删除：1")
    private Integer isDel = 0;
}
