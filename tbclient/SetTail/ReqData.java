package tbclient.SetTail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

/* loaded from: classes4.dex */
public final class ReqData extends Message {

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 3)
    public final CommonReq f1532common;

    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer tailId;

    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer type;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Integer DEFAULT_TAILID = 0;

    public static final class Builder extends Message.Builder<ReqData> {

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1533common;
        public Integer tailId;
        public Integer type;

        public Builder() {
        }

        public Builder(ReqData reqData) {
            super(reqData);
            if (reqData == null) {
                return;
            }
            this.type = reqData.type;
            this.tailId = reqData.tailId;
            this.f1533common = reqData.f1532common;
        }

        @Override // com.squareup.wire.Message.Builder
        public ReqData build(boolean z) {
            return new ReqData(this, z);
        }
    }

    public ReqData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            Integer num2 = builder.tailId;
            if (num2 == null) {
                this.tailId = DEFAULT_TAILID;
            } else {
                this.tailId = num2;
            }
            this.f1532common = builder.f1533common;
            return;
        }
        this.type = builder.type;
        this.tailId = builder.tailId;
        this.f1532common = builder.f1533common;
    }
}