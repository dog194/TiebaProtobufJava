package protobuf.LogStat;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_STEXT = "";
    public static final String DEFAULT_STTYPE = "";

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String stExt;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String stType;

    public static final class Builder extends Message.Builder<DataReq> {
        public String stExt;
        public String stType;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.stType = dataReq.stType;
            this.stExt = dataReq.stExt;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.stType;
            if (str == null) {
                this.stType = "";
            } else {
                this.stType = str;
            }
            String str2 = builder.stExt;
            if (str2 == null) {
                this.stExt = "";
                return;
            } else {
                this.stExt = str2;
                return;
            }
        }
        this.stType = builder.stType;
        this.stExt = builder.stExt;
    }
}