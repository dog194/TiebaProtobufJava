package protobuf.QueryLiveGroupLikeList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class LikeUserInfo extends Message {
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_USERNAME = "";

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String portrait;

    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer time;

    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long userId;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String userName;
    public static final Long DEFAULT_USERID = 0L;
    public static final Integer DEFAULT_TIME = 0;

    public static final class Builder extends Message.Builder<LikeUserInfo> {
        public String portrait;
        public Integer time;
        public Long userId;
        public String userName;

        public Builder() {
        }

        public Builder(LikeUserInfo likeUserInfo) {
            super(likeUserInfo);
            if (likeUserInfo == null) {
                return;
            }
            this.userId = likeUserInfo.userId;
            this.userName = likeUserInfo.userName;
            this.portrait = likeUserInfo.portrait;
            this.time = likeUserInfo.time;
        }

        @Override // com.squareup.wire.Message.Builder
        public LikeUserInfo build(boolean z) {
            return new LikeUserInfo(this, z);
        }
    }

    public LikeUserInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.userId;
            if (l == null) {
                this.userId = DEFAULT_USERID;
            } else {
                this.userId = l;
            }
            String str = builder.userName;
            if (str == null) {
                this.userName = "";
            } else {
                this.userName = str;
            }
            String str2 = builder.portrait;
            if (str2 == null) {
                this.portrait = "";
            } else {
                this.portrait = str2;
            }
            Integer num = builder.time;
            if (num == null) {
                this.time = DEFAULT_TIME;
                return;
            } else {
                this.time = num;
                return;
            }
        }
        this.userId = builder.userId;
        this.userName = builder.userName;
        this.portrait = builder.portrait;
        this.time = builder.time;
    }
}