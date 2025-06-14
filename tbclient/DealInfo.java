package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class DealInfo extends Message {
    public static final String DEFAULT_DES = "";
    public static final String DEFAULT_SELLER_ADDRESS = "";
    public static final String DEFAULT_TITLE = "";

    @ProtoField(label = Message.Label.REPEATED, tag = 13)
    public final List<DealAuthInfo> auth_info;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String des;

    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer expire_time;

    @ProtoField(tag = 10, type = Message.Datatype.BOOL)
    public final Boolean has_recommend;

    @ProtoField(label = Message.Label.REPEATED, tag = 12)
    public final List<DealMedia> media;

    @ProtoField(tag = 7, type = Message.Datatype.UINT64)
    public final Long product_id;

    @ProtoField(tag = 9, type = Message.Datatype.INT64)
    public final Long recommendations;

    @ProtoField(tag = 4, type = Message.Datatype.UINT64)
    public final Long sales;

    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String seller_address;

    @ProtoField(tag = 14, type = Message.Datatype.UINT64)
    public final Long ship_fee;

    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer status;

    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long stock;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;

    @ProtoField(tag = 6, type = Message.Datatype.UINT64)
    public final Long unit_price;
    public static final Long DEFAULT_STOCK = 0L;
    public static final Long DEFAULT_SALES = 0L;
    public static final Integer DEFAULT_EXPIRE_TIME = 0;
    public static final Long DEFAULT_UNIT_PRICE = 0L;
    public static final Long DEFAULT_PRODUCT_ID = 0L;
    public static final Long DEFAULT_RECOMMENDATIONS = 0L;
    public static final Boolean DEFAULT_HAS_RECOMMEND = Boolean.FALSE;
    public static final Integer DEFAULT_STATUS = 0;
    public static final List<DealMedia> DEFAULT_MEDIA = Collections.emptyList();
    public static final List<DealAuthInfo> DEFAULT_AUTH_INFO = Collections.emptyList();
    public static final Long DEFAULT_SHIP_FEE = 0L;

    public static final class Builder extends Message.Builder<DealInfo> {
        public List<DealAuthInfo> auth_info;
        public String des;
        public Integer expire_time;
        public Boolean has_recommend;
        public List<DealMedia> media;
        public Long product_id;
        public Long recommendations;
        public Long sales;
        public String seller_address;
        public Long ship_fee;
        public Integer status;
        public Long stock;
        public String title;
        public Long unit_price;

        public Builder() {
        }

        public Builder(DealInfo dealInfo) {
            super(dealInfo);
            if (dealInfo == null) {
                return;
            }
            this.title = dealInfo.title;
            this.des = dealInfo.des;
            this.stock = dealInfo.stock;
            this.sales = dealInfo.sales;
            this.expire_time = dealInfo.expire_time;
            this.unit_price = dealInfo.unit_price;
            this.product_id = dealInfo.product_id;
            this.seller_address = dealInfo.seller_address;
            this.recommendations = dealInfo.recommendations;
            this.has_recommend = dealInfo.has_recommend;
            this.status = dealInfo.status;
            this.media = Message.copyOf(dealInfo.media);
            this.auth_info = Message.copyOf(dealInfo.auth_info);
            this.ship_fee = dealInfo.ship_fee;
        }

        @Override // com.squareup.wire.Message.Builder
        public DealInfo build(boolean z) {
            return new DealInfo(this, z);
        }
    }

    public DealInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.des;
            if (str2 == null) {
                this.des = "";
            } else {
                this.des = str2;
            }
            Long l = builder.stock;
            if (l == null) {
                this.stock = DEFAULT_STOCK;
            } else {
                this.stock = l;
            }
            Long l2 = builder.sales;
            if (l2 == null) {
                this.sales = DEFAULT_SALES;
            } else {
                this.sales = l2;
            }
            Integer num = builder.expire_time;
            if (num == null) {
                this.expire_time = DEFAULT_EXPIRE_TIME;
            } else {
                this.expire_time = num;
            }
            Long l3 = builder.unit_price;
            if (l3 == null) {
                this.unit_price = DEFAULT_UNIT_PRICE;
            } else {
                this.unit_price = l3;
            }
            Long l4 = builder.product_id;
            if (l4 == null) {
                this.product_id = DEFAULT_PRODUCT_ID;
            } else {
                this.product_id = l4;
            }
            String str3 = builder.seller_address;
            if (str3 == null) {
                this.seller_address = "";
            } else {
                this.seller_address = str3;
            }
            Long l5 = builder.recommendations;
            if (l5 == null) {
                this.recommendations = DEFAULT_RECOMMENDATIONS;
            } else {
                this.recommendations = l5;
            }
            Boolean bool = builder.has_recommend;
            if (bool == null) {
                this.has_recommend = DEFAULT_HAS_RECOMMEND;
            } else {
                this.has_recommend = bool;
            }
            Integer num2 = builder.status;
            if (num2 == null) {
                this.status = DEFAULT_STATUS;
            } else {
                this.status = num2;
            }
            List<DealMedia> list = builder.media;
            if (list == null) {
                this.media = DEFAULT_MEDIA;
            } else {
                this.media = Message.immutableCopyOf(list);
            }
            List<DealAuthInfo> list2 = builder.auth_info;
            if (list2 == null) {
                this.auth_info = DEFAULT_AUTH_INFO;
            } else {
                this.auth_info = Message.immutableCopyOf(list2);
            }
            Long l6 = builder.ship_fee;
            if (l6 == null) {
                this.ship_fee = DEFAULT_SHIP_FEE;
                return;
            } else {
                this.ship_fee = l6;
                return;
            }
        }
        this.title = builder.title;
        this.des = builder.des;
        this.stock = builder.stock;
        this.sales = builder.sales;
        this.expire_time = builder.expire_time;
        this.unit_price = builder.unit_price;
        this.product_id = builder.product_id;
        this.seller_address = builder.seller_address;
        this.recommendations = builder.recommendations;
        this.has_recommend = builder.has_recommend;
        this.status = builder.status;
        this.media = Message.immutableCopyOf(builder.media);
        this.auth_info = Message.immutableCopyOf(builder.auth_info);
        this.ship_fee = builder.ship_fee;
    }
}