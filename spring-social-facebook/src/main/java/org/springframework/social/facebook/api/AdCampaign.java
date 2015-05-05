package org.springframework.social.facebook.api;

/**
 * Model class representing an ad campaign.
 *
 * @author Sebastian G�recki
 */
public class AdCampaign extends FacebookObject {
	private String id;
	private String accountId;
	private BuyingType buyingType;
	private CampaignStatus campaignStatus;
	private String name;
	private CampaignObjective objective;
	private String spendCap;

	public AdCampaign() {
	}

	public CampaignStatus getCampaignStatus() {
		return campaignStatus;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public String getAccountId() {
		return accountId;
	}

	public BuyingType getBuyingType() {
		return buyingType;
	}

	public CampaignObjective getObjective() {
		return objective;
	}

	public String getSpendCap() {
		return spendCap;
	}

	public enum BuyingType {
		AUCTION, FIXED_CPM, RESERVED, MIXED, UNKNOWN
	}

	public enum CampaignStatus {
		ACTIVE, PAUSED, ARCHIVED, DELETED, UNKNOWN
	}

	public enum CampaignObjective {
		CANVAS_APP_ENGAGEMENT, CANVAS_APP_INSTALLS, EVENT_RESPONSES, LOCAL_AWARENESS, MOBILE_APP_ENGAGEMENT,
		MOBILE_APP_INSTALLS, NONE, OFFER_CLAIMS, PAGE_LIKES, POST_ENGAGEMENT, VIDEO_VIEWS, WEBSITE_CLICKS,
		WEBSITE_CONVERSIONS, UNKNOWN
	}
}