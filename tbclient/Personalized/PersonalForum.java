package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class PersonalForum extends Message {
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_RECOM_REASON = "";
    public static final String DEFAULT_WEIGHT = "";

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String avatar;

    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long forum_id;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String forum_name;

    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer is_like;

    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String recom_reason;

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String weight;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_IS_LIKE = 0;

    public static final class Builder extends Message.Builder<PersonalForum> {
        public String avatar;
        public Long forum_id;
        public String forum_name;
        public Integer is_like;
        public String recom_reason;
        public String weight;

        public Builder() {
        }

        public Builder(PersonalForum personalForum) {
            super(personalForum);
            if (personalForum == null) {
                return;
            }
            this.forum_id = personalForum.forum_id;
            this.forum_name = personalForum.forum_name;
            this.avatar = personalForum.avatar;
            this.is_like = personalForum.is_like;
            this.weight = personalForum.weight;
            this.recom_reason = personalForum.recom_reason;
        }

        @Override // com.squareup.wire.Message.Builder
        public PersonalForum build(boolean z) {
            return new PersonalForum(this, z);
        }
    }

    public PersonalForum(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l;
            }
            String str = builder.forum_name;
            if (str == null) {
                this.forum_name = "";
            } else {
                this.forum_name = str;
            }
            String str2 = builder.avatar;
            if (str2 == null) {
                this.avatar = "";
            } else {
                this.avatar = str2;
            }
            Integer num = builder.is_like;
            if (num == null) {
                this.is_like = DEFAULT_IS_LIKE;
            } else {
                this.is_like = num;
            }
            String str3 = builder.weight;
            if (str3 == null) {
                this.weight = "";
            } else {
                this.weight = str3;
            }
            String str4 = builder.recom_reason;
            if (str4 == null) {
                this.recom_reason = "";
                return;
            } else {
                this.recom_reason = str4;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.avatar = builder.avatar;
        this.is_like = builder.is_like;
        this.weight = builder.weight;
        this.recom_reason = builder.recom_reason;
    }
}