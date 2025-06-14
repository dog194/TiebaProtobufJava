package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class TiebaPlusInfo extends Message {
    public static final String DEFAULT_APP_COMPANY = "";
    public static final String DEFAULT_APP_EFFECT = "";
    public static final String DEFAULT_APP_ICON = "";
    public static final String DEFAULT_APP_ID = "";
    public static final String DEFAULT_APP_PACKAGE = "";
    public static final String DEFAULT_APP_POWER = "";
    public static final String DEFAULT_APP_PRIVACY = "";
    public static final String DEFAULT_APP_VERSION = "";
    public static final String DEFAULT_BUTTON_DESC = "";
    public static final String DEFAULT_DESC = "";
    public static final String DEFAULT_DOWNLOAD_URL = "";
    public static final String DEFAULT_EXTRA_PARAM = "";
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_H5_JUMP_NUMBER = "";
    public static final String DEFAULT_H5_JUMP_PARAM = "";
    public static final String DEFAULT_ITEM_ID = "";
    public static final String DEFAULT_JUMP_URL = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_TOKEN = "";
    public static final String DEFAULT_WX_THUMBNAIL = "";

    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String app_company;

    @ProtoField(tag = 24, type = Message.Datatype.STRING)
    public final String app_effect;

    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String app_icon;

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String app_id;

    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String app_package;

    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String app_power;

    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String app_privacy;

    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String app_version;

    @ProtoField(tag = 23, type = Message.Datatype.STRING)
    public final String button_desc;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String desc;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String download_url;

    @ProtoField(tag = 27, type = Message.Datatype.STRING)
    public final String extra_param;

    @ProtoField(tag = 20, type = Message.Datatype.STRING)
    public final String forum_name;

    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String h5_jump_number;

    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String h5_jump_param;

    @ProtoField(tag = 13, type = Message.Datatype.INT32)
    public final Integer h5_jump_type;

    @ProtoField(tag = 18, type = Message.Datatype.INT32)
    public final Integer is_appoint;

    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public final String item_id;

    @ProtoField(tag = 21, type = Message.Datatype.INT32)
    public final Integer jump_setting;

    @ProtoField(tag = 16, type = Message.Datatype.INT32)
    public final Integer jump_type;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String jump_url;

    @ProtoField(tag = 25, type = Message.Datatype.INT32)
    public final Integer plugin_id;

    @ProtoField(tag = 19)
    public final PluginUser plugin_user;

    @ProtoField(tag = 12, type = Message.Datatype.INT32)
    public final Integer target_type;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;

    @ProtoField(tag = 26, type = Message.Datatype.STRING)
    public final String token;

    @ProtoField(tag = 22, type = Message.Datatype.STRING)
    public final String wx_thumbnail;
    public static final Integer DEFAULT_TARGET_TYPE = 0;
    public static final Integer DEFAULT_H5_JUMP_TYPE = 0;
    public static final Integer DEFAULT_JUMP_TYPE = 0;
    public static final Integer DEFAULT_IS_APPOINT = 0;
    public static final Integer DEFAULT_JUMP_SETTING = 0;
    public static final Integer DEFAULT_PLUGIN_ID = 0;

    public static final class Builder extends Message.Builder<TiebaPlusInfo> {
        public String app_company;
        public String app_effect;
        public String app_icon;
        public String app_id;
        public String app_package;
        public String app_power;
        public String app_privacy;
        public String app_version;
        public String button_desc;
        public String desc;
        public String download_url;
        public String extra_param;
        public String forum_name;
        public String h5_jump_number;
        public String h5_jump_param;
        public Integer h5_jump_type;
        public Integer is_appoint;
        public String item_id;
        public Integer jump_setting;
        public Integer jump_type;
        public String jump_url;
        public Integer plugin_id;
        public PluginUser plugin_user;
        public Integer target_type;
        public String title;
        public String token;
        public String wx_thumbnail;

        public Builder() {
        }

        public Builder(TiebaPlusInfo tiebaPlusInfo) {
            super(tiebaPlusInfo);
            if (tiebaPlusInfo == null) {
                return;
            }
            this.title = tiebaPlusInfo.title;
            this.desc = tiebaPlusInfo.desc;
            this.jump_url = tiebaPlusInfo.jump_url;
            this.download_url = tiebaPlusInfo.download_url;
            this.app_id = tiebaPlusInfo.app_id;
            this.app_icon = tiebaPlusInfo.app_icon;
            this.app_package = tiebaPlusInfo.app_package;
            this.app_version = tiebaPlusInfo.app_version;
            this.app_privacy = tiebaPlusInfo.app_privacy;
            this.app_power = tiebaPlusInfo.app_power;
            this.app_company = tiebaPlusInfo.app_company;
            this.target_type = tiebaPlusInfo.target_type;
            this.h5_jump_type = tiebaPlusInfo.h5_jump_type;
            this.h5_jump_number = tiebaPlusInfo.h5_jump_number;
            this.h5_jump_param = tiebaPlusInfo.h5_jump_param;
            this.jump_type = tiebaPlusInfo.jump_type;
            this.item_id = tiebaPlusInfo.item_id;
            this.is_appoint = tiebaPlusInfo.is_appoint;
            this.plugin_user = tiebaPlusInfo.plugin_user;
            this.forum_name = tiebaPlusInfo.forum_name;
            this.jump_setting = tiebaPlusInfo.jump_setting;
            this.wx_thumbnail = tiebaPlusInfo.wx_thumbnail;
            this.button_desc = tiebaPlusInfo.button_desc;
            this.app_effect = tiebaPlusInfo.app_effect;
            this.plugin_id = tiebaPlusInfo.plugin_id;
            this.token = tiebaPlusInfo.token;
            this.extra_param = tiebaPlusInfo.extra_param;
        }

        @Override // com.squareup.wire.Message.Builder
        public TiebaPlusInfo build(boolean z) {
            return new TiebaPlusInfo(this, z);
        }
    }

    public TiebaPlusInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.desc;
            if (str2 == null) {
                this.desc = "";
            } else {
                this.desc = str2;
            }
            String str3 = builder.jump_url;
            if (str3 == null) {
                this.jump_url = "";
            } else {
                this.jump_url = str3;
            }
            String str4 = builder.download_url;
            if (str4 == null) {
                this.download_url = "";
            } else {
                this.download_url = str4;
            }
            String str5 = builder.app_id;
            if (str5 == null) {
                this.app_id = "";
            } else {
                this.app_id = str5;
            }
            String str6 = builder.app_icon;
            if (str6 == null) {
                this.app_icon = "";
            } else {
                this.app_icon = str6;
            }
            String str7 = builder.app_package;
            if (str7 == null) {
                this.app_package = "";
            } else {
                this.app_package = str7;
            }
            String str8 = builder.app_version;
            if (str8 == null) {
                this.app_version = "";
            } else {
                this.app_version = str8;
            }
            String str9 = builder.app_privacy;
            if (str9 == null) {
                this.app_privacy = "";
            } else {
                this.app_privacy = str9;
            }
            String str10 = builder.app_power;
            if (str10 == null) {
                this.app_power = "";
            } else {
                this.app_power = str10;
            }
            String str11 = builder.app_company;
            if (str11 == null) {
                this.app_company = "";
            } else {
                this.app_company = str11;
            }
            Integer num = builder.target_type;
            if (num == null) {
                this.target_type = DEFAULT_TARGET_TYPE;
            } else {
                this.target_type = num;
            }
            Integer num2 = builder.h5_jump_type;
            if (num2 == null) {
                this.h5_jump_type = DEFAULT_H5_JUMP_TYPE;
            } else {
                this.h5_jump_type = num2;
            }
            String str12 = builder.h5_jump_number;
            if (str12 == null) {
                this.h5_jump_number = "";
            } else {
                this.h5_jump_number = str12;
            }
            String str13 = builder.h5_jump_param;
            if (str13 == null) {
                this.h5_jump_param = "";
            } else {
                this.h5_jump_param = str13;
            }
            Integer num3 = builder.jump_type;
            if (num3 == null) {
                this.jump_type = DEFAULT_JUMP_TYPE;
            } else {
                this.jump_type = num3;
            }
            String str14 = builder.item_id;
            if (str14 == null) {
                this.item_id = "";
            } else {
                this.item_id = str14;
            }
            Integer num4 = builder.is_appoint;
            if (num4 == null) {
                this.is_appoint = DEFAULT_IS_APPOINT;
            } else {
                this.is_appoint = num4;
            }
            this.plugin_user = builder.plugin_user;
            String str15 = builder.forum_name;
            if (str15 == null) {
                this.forum_name = "";
            } else {
                this.forum_name = str15;
            }
            Integer num5 = builder.jump_setting;
            if (num5 == null) {
                this.jump_setting = DEFAULT_JUMP_SETTING;
            } else {
                this.jump_setting = num5;
            }
            String str16 = builder.wx_thumbnail;
            if (str16 == null) {
                this.wx_thumbnail = "";
            } else {
                this.wx_thumbnail = str16;
            }
            String str17 = builder.button_desc;
            if (str17 == null) {
                this.button_desc = "";
            } else {
                this.button_desc = str17;
            }
            String str18 = builder.app_effect;
            if (str18 == null) {
                this.app_effect = "";
            } else {
                this.app_effect = str18;
            }
            Integer num6 = builder.plugin_id;
            if (num6 == null) {
                this.plugin_id = DEFAULT_PLUGIN_ID;
            } else {
                this.plugin_id = num6;
            }
            String str19 = builder.token;
            if (str19 == null) {
                this.token = "";
            } else {
                this.token = str19;
            }
            String str20 = builder.extra_param;
            if (str20 == null) {
                this.extra_param = "";
                return;
            } else {
                this.extra_param = str20;
                return;
            }
        }
        this.title = builder.title;
        this.desc = builder.desc;
        this.jump_url = builder.jump_url;
        this.download_url = builder.download_url;
        this.app_id = builder.app_id;
        this.app_icon = builder.app_icon;
        this.app_package = builder.app_package;
        this.app_version = builder.app_version;
        this.app_privacy = builder.app_privacy;
        this.app_power = builder.app_power;
        this.app_company = builder.app_company;
        this.target_type = builder.target_type;
        this.h5_jump_type = builder.h5_jump_type;
        this.h5_jump_number = builder.h5_jump_number;
        this.h5_jump_param = builder.h5_jump_param;
        this.jump_type = builder.jump_type;
        this.item_id = builder.item_id;
        this.is_appoint = builder.is_appoint;
        this.plugin_user = builder.plugin_user;
        this.forum_name = builder.forum_name;
        this.jump_setting = builder.jump_setting;
        this.wx_thumbnail = builder.wx_thumbnail;
        this.button_desc = builder.button_desc;
        this.app_effect = builder.app_effect;
        this.plugin_id = builder.plugin_id;
        this.token = builder.token;
        this.extra_param = builder.extra_param;
    }
}