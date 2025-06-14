package tbclient.Person;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Icon;

/* loaded from: classes4.dex */
public final class UserInfos extends Message {
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_SEX = "";
    public static final String DEFAULT_USERDETAIL = "";
    public static final String DEFAULT_USER_NAME = "";

    @ProtoField(tag = 5, type = Message.Datatype.DOUBLE)
    public final Double distance;

    @ProtoField(label = Message.Label.REPEATED, tag = 7)
    public final List<Icon> iconinfo;

    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer lastest_time;

    @ProtoField(tag = 9)
    public final LbsInfo location;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String portrait;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String sex;

    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long user_id;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String user_name;

    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String userdetail;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Double DEFAULT_DISTANCE = Double.valueOf(0.0d);
    public static final Integer DEFAULT_LASTEST_TIME = 0;
    public static final List<Icon> DEFAULT_ICONINFO = Collections.emptyList();

    public static final class Builder extends Message.Builder<UserInfos> {
        public Double distance;
        public List<Icon> iconinfo;
        public Integer lastest_time;
        public LbsInfo location;
        public String portrait;
        public String sex;
        public Long user_id;
        public String user_name;
        public String userdetail;

        public Builder() {
        }

        public Builder(UserInfos userInfos) {
            super(userInfos);
            if (userInfos == null) {
                return;
            }
            this.user_id = userInfos.user_id;
            this.user_name = userInfos.user_name;
            this.portrait = userInfos.portrait;
            this.sex = userInfos.sex;
            this.distance = userInfos.distance;
            this.lastest_time = userInfos.lastest_time;
            this.iconinfo = Message.copyOf(userInfos.iconinfo);
            this.userdetail = userInfos.userdetail;
            this.location = userInfos.location;
        }

        @Override // com.squareup.wire.Message.Builder
        public UserInfos build(boolean z) {
            return new UserInfos(this, z);
        }
    }

    public UserInfos(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.user_id;
            if (l == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l;
            }
            String str = builder.user_name;
            if (str == null) {
                this.user_name = "";
            } else {
                this.user_name = str;
            }
            String str2 = builder.portrait;
            if (str2 == null) {
                this.portrait = "";
            } else {
                this.portrait = str2;
            }
            String str3 = builder.sex;
            if (str3 == null) {
                this.sex = "";
            } else {
                this.sex = str3;
            }
            Double d = builder.distance;
            if (d == null) {
                this.distance = DEFAULT_DISTANCE;
            } else {
                this.distance = d;
            }
            Integer num = builder.lastest_time;
            if (num == null) {
                this.lastest_time = DEFAULT_LASTEST_TIME;
            } else {
                this.lastest_time = num;
            }
            List<Icon> list = builder.iconinfo;
            if (list == null) {
                this.iconinfo = DEFAULT_ICONINFO;
            } else {
                this.iconinfo = Message.immutableCopyOf(list);
            }
            String str4 = builder.userdetail;
            if (str4 == null) {
                this.userdetail = "";
            } else {
                this.userdetail = str4;
            }
            this.location = builder.location;
            return;
        }
        this.user_id = builder.user_id;
        this.user_name = builder.user_name;
        this.portrait = builder.portrait;
        this.sex = builder.sex;
        this.distance = builder.distance;
        this.lastest_time = builder.lastest_time;
        this.iconinfo = Message.immutableCopyOf(builder.iconinfo);
        this.userdetail = builder.userdetail;
        this.location = builder.location;
    }
}