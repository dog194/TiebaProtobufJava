package protobuf.GetMaskInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class UserInfo extends Message {
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_NAMESHOW = "";
    public static final String DEFAULT_PORTRAIT = "";
    public static final Long DEFAULT_UID = 0L;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String name;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String nameShow;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String portrait;

    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long uid;

    public static final class Builder extends Message.Builder<UserInfo> {
        public String name;
        public String nameShow;
        public String portrait;
        public Long uid;

        public Builder() {
        }

        public Builder(UserInfo userInfo) {
            super(userInfo);
            if (userInfo == null) {
                return;
            }
            this.name = userInfo.name;
            this.portrait = userInfo.portrait;
            this.uid = userInfo.uid;
            this.nameShow = userInfo.nameShow;
        }

        @Override // com.squareup.wire.Message.Builder
        public UserInfo build(boolean z) {
            return new UserInfo(this, z);
        }
    }

    public UserInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            String str2 = builder.portrait;
            if (str2 == null) {
                this.portrait = "";
            } else {
                this.portrait = str2;
            }
            Long l = builder.uid;
            if (l == null) {
                this.uid = DEFAULT_UID;
            } else {
                this.uid = l;
            }
            String str3 = builder.nameShow;
            if (str3 == null) {
                this.nameShow = "";
                return;
            } else {
                this.nameShow = str3;
                return;
            }
        }
        this.name = builder.name;
        this.portrait = builder.portrait;
        this.uid = builder.uid;
        this.nameShow = builder.nameShow;
    }
}