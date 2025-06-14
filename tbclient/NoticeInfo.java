package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class NoticeInfo extends Message {
    public static final String DEFAULT_NOTICE = "";
    public static final Integer DEFAULT_PULLCOMMENTFREQUENCE = 0;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String notice;

    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer pullCommentFrequence;

    public static final class Builder extends Message.Builder<NoticeInfo> {
        public String notice;
        public Integer pullCommentFrequence;

        public Builder() {
        }

        public Builder(NoticeInfo noticeInfo) {
            super(noticeInfo);
            if (noticeInfo == null) {
                return;
            }
            this.notice = noticeInfo.notice;
            this.pullCommentFrequence = noticeInfo.pullCommentFrequence;
        }

        @Override // com.squareup.wire.Message.Builder
        public NoticeInfo build(boolean z) {
            return new NoticeInfo(this, z);
        }
    }

    public NoticeInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.notice;
            if (str == null) {
                this.notice = "";
            } else {
                this.notice = str;
            }
            Integer num = builder.pullCommentFrequence;
            if (num == null) {
                this.pullCommentFrequence = DEFAULT_PULLCOMMENTFREQUENCE;
                return;
            } else {
                this.pullCommentFrequence = num;
                return;
            }
        }
        this.notice = builder.notice;
        this.pullCommentFrequence = builder.pullCommentFrequence;
    }
}