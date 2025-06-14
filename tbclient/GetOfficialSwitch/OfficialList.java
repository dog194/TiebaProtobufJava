package tbclient.GetOfficialSwitch;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class OfficialList extends Message {
    public static final String DEFAULT_NAME = "";

    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer is_on;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;

    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long uid;
    public static final Long DEFAULT_UID = 0L;
    public static final Integer DEFAULT_IS_ON = 0;

    public static final class Builder extends Message.Builder<OfficialList> {
        public Integer is_on;
        public String name;
        public Long uid;

        public Builder() {
        }

        public Builder(OfficialList officialList) {
            super(officialList);
            if (officialList == null) {
                return;
            }
            this.uid = officialList.uid;
            this.name = officialList.name;
            this.is_on = officialList.is_on;
        }

        @Override // com.squareup.wire.Message.Builder
        public OfficialList build(boolean z) {
            return new OfficialList(this, z);
        }
    }

    public OfficialList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.uid;
            if (l == null) {
                this.uid = DEFAULT_UID;
            } else {
                this.uid = l;
            }
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            Integer num = builder.is_on;
            if (num == null) {
                this.is_on = DEFAULT_IS_ON;
                return;
            } else {
                this.is_on = num;
                return;
            }
        }
        this.uid = builder.uid;
        this.name = builder.name;
        this.is_on = builder.is_on;
    }
}