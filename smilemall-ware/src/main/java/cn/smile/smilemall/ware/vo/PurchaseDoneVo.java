package cn.smile.smilemall.ware.vo;

import lombok.Data;

import java.util.List;

/**
 * @author Smile
 * @Documents
 * @creationTime 2021-01-2021/1/28/028
 */
@Data
public class PurchaseDoneVo {
	
	private Long purchaseId;
	private List<PurchaseDoneItemsVo> purchaseDoneItemsVos;
}
