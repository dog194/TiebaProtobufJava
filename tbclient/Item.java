package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class Item extends Message {
    public static final Integer DEFAULT_ABLE_CANCEL_SUBSCRIBE;
    public static final String DEFAULT_APK_NAME = "";
    public static final String DEFAULT_BUTTON_LINK = "";
    public static final Integer DEFAULT_BUTTON_LINK_TYPE;
    public static final String DEFAULT_BUTTON_NAME = "";
    public static final Integer DEFAULT_CATEGORY_ID;
    public static final String DEFAULT_ERR_TOAST = "";
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_GAME_ID = "";
    public static final Double DEFAULT_ICON_SIZE;
    public static final String DEFAULT_ICON_URL = "";
    public static final String DEFAULT_ITEM_APPID = "";
    public static final Long DEFAULT_ITEM_ID = 0L;
    public static final String DEFAULT_ITEM_NAME = "";
    public static final Double DEFAULT_SCORE;
    public static final Integer DEFAULT_STAR;
    public static final List<String> DEFAULT_TAGS;

    @ProtoField(tag = 18, type = Message.Datatype.INT32)
    public final Integer able_cancel_subscribe;

    @ProtoField(tag = 15)
    public final ApkDetail apk_detail;

    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String apk_name;

    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String button_link;

    @ProtoField(tag = 12, type = Message.Datatype.INT32)
    public final Integer button_link_type;

    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String button_name;

    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer category_id;

    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public final String err_toast;

    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String forum_name;

    @ProtoField(tag = 16, type = Message.Datatype.STRING)
    public final String game_id;

    @ProtoField(tag = 3, type = Message.Datatype.DOUBLE)
    public final Double icon_size;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String icon_url;

    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String item_appid;

    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long item_id;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String item_name;

    @ProtoField(tag = 6, type = Message.Datatype.DOUBLE)
    public final Double score;

    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer star;

    @ProtoField(label = Message.Label.REPEATED, tag = 5, type = Message.Datatype.STRING)
    public final List<String> tags;

    public static final class Builder extends Message.Builder<Item> {
        public Integer able_cancel_subscribe;
        public ApkDetail apk_detail;
        public String apk_name;
        public String button_link;
        public Integer button_link_type;
        public String button_name;
        public Integer category_id;
        public String err_toast;
        public String forum_name;
        public String game_id;
        public Double icon_size;
        public String icon_url;
        public String item_appid;
        public Long item_id;
        public String item_name;
        public Double score;
        public Integer star;
        public List<String> tags;

        public Builder() {
        }

        public Builder(Item item) {
            super(item);
            if (item == null) {
                return;
            }
            this.item_id = item.item_id;
            this.item_name = item.item_name;
            this.icon_size = item.icon_size;
            this.icon_url = item.icon_url;
            this.tags = Message.copyOf(item.tags);
            this.score = item.score;
            this.star = item.star;
            this.button_name = item.button_name;
            this.button_link = item.button_link;
            this.item_appid = item.item_appid;
            this.category_id = item.category_id;
            this.button_link_type = item.button_link_type;
            this.apk_name = item.apk_name;
            this.forum_name = item.forum_name;
            this.apk_detail = item.apk_detail;
            this.game_id = item.game_id;
            this.err_toast = item.err_toast;
            this.able_cancel_subscribe = item.able_cancel_subscribe;
        }

        @Override // com.squareup.wire.Message.Builder
        public Item build(boolean z) {
            return new Item(this, z);
        }
    }

    static {
        Double valueOf = Double.valueOf(0.0d);
        DEFAULT_ICON_SIZE = valueOf;
        DEFAULT_TAGS = Collections.emptyList();
        DEFAULT_SCORE = valueOf;
        DEFAULT_STAR = 0;
        DEFAULT_CATEGORY_ID = 0;
        DEFAULT_BUTTON_LINK_TYPE = 0;
        DEFAULT_ABLE_CANCEL_SUBSCRIBE = 0;
    }

    public Item(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.item_id;
            if (l == null) {
                this.item_id = DEFAULT_ITEM_ID;
            } else {
                this.item_id = l;
            }
            String str = builder.item_name;
            if (str == null) {
                this.item_name = "";
            } else {
                this.item_name = str;
            }
            Double d = builder.icon_size;
            if (d == null) {
                this.icon_size = DEFAULT_ICON_SIZE;
            } else {
                this.icon_size = d;
            }
            String str2 = builder.icon_url;
            if (str2 == null) {
                this.icon_url = "";
            } else {
                this.icon_url = str2;
            }
            List<String> list = builder.tags;
            if (list == null) {
                this.tags = DEFAULT_TAGS;
            } else {
                this.tags = Message.immutableCopyOf(list);
            }
            Double d2 = builder.score;
            if (d2 == null) {
                this.score = DEFAULT_SCORE;
            } else {
                this.score = d2;
            }
            Integer num = builder.star;
            if (num == null) {
                this.star = DEFAULT_STAR;
            } else {
                this.star = num;
            }
            String str3 = builder.button_name;
            if (str3 == null) {
                this.button_name = "";
            } else {
                this.button_name = str3;
            }
            String str4 = builder.button_link;
            if (str4 == null) {
                this.button_link = "";
            } else {
                this.button_link = str4;
            }
            String str5 = builder.item_appid;
            if (str5 == null) {
                this.item_appid = "";
            } else {
                this.item_appid = str5;
            }
            Integer num2 = builder.category_id;
            if (num2 == null) {
                this.category_id = DEFAULT_CATEGORY_ID;
            } else {
                this.category_id = num2;
            }
            Integer num3 = builder.button_link_type;
            if (num3 == null) {
                this.button_link_type = DEFAULT_BUTTON_LINK_TYPE;
            } else {
                this.button_link_type = num3;
            }
            String str6 = builder.apk_name;
            if (str6 == null) {
                this.apk_name = "";
            } else {
                this.apk_name = str6;
            }
            String str7 = builder.forum_name;
            if (str7 == null) {
                this.forum_name = "";
            } else {
                this.forum_name = str7;
            }
            this.apk_detail = builder.apk_detail;
            String str8 = builder.game_id;
            if (str8 == null) {
                this.game_id = "";
            } else {
                this.game_id = str8;
            }
            String str9 = builder.err_toast;
            if (str9 == null) {
                this.err_toast = "";
            } else {
                this.err_toast = str9;
            }
            Integer num4 = builder.able_cancel_subscribe;
            if (num4 == null) {
                this.able_cancel_subscribe = DEFAULT_ABLE_CANCEL_SUBSCRIBE;
                return;
            } else {
                this.able_cancel_subscribe = num4;
                return;
            }
        }
        this.item_id = builder.item_id;
        this.item_name = builder.item_name;
        this.icon_size = builder.icon_size;
        this.icon_url = builder.icon_url;
        this.tags = Message.immutableCopyOf(builder.tags);
        this.score = builder.score;
        this.star = builder.star;
        this.button_name = builder.button_name;
        this.button_link = builder.button_link;
        this.item_appid = builder.item_appid;
        this.category_id = builder.category_id;
        this.button_link_type = builder.button_link_type;
        this.apk_name = builder.apk_name;
        this.forum_name = builder.forum_name;
        this.apk_detail = builder.apk_detail;
        this.game_id = builder.game_id;
        this.err_toast = builder.err_toast;
        this.able_cancel_subscribe = builder.able_cancel_subscribe;
    }
}