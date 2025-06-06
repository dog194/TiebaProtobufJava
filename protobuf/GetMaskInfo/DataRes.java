package protobuf.GetMaskInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_LIST = "";

    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer isMask;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String list;

    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<UserInfo> users;
    public static final Integer DEFAULT_ISMASK = 0;
    public static final List<UserInfo> DEFAULT_USERS = Collections.emptyList();

    public static final class Builder extends Message.Builder<DataRes> {
        public Integer isMask;
        public String list;
        public List<UserInfo> users;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.isMask = dataRes.isMask;
            this.list = dataRes.list;
            this.users = Message.copyOf(dataRes.users);
        }

        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.isMask;
            if (num == null) {
                this.isMask = DEFAULT_ISMASK;
            } else {
                this.isMask = num;
            }
            String str = builder.list;
            if (str == null) {
                this.list = "";
            } else {
                this.list = str;
            }
            List<UserInfo> list = builder.users;
            if (list == null) {
                this.users = DEFAULT_USERS;
                return;
            } else {
                this.users = Message.immutableCopyOf(list);
                return;
            }
        }
        this.isMask = builder.isMask;
        this.list = builder.list;
        this.users = Message.immutableCopyOf(builder.users);
    }
}