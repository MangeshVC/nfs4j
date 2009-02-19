package org.dcache.xdr;

public abstract class RpcAcceptedReply extends RpcReply {

    /* (non-Javadoc)
     * @see org.dcache.xdr.RpcReply#xdrEncode(org.dcache.xdr.Xdr)
     */
    @Override
    public void xdrEncode(Xdr xdr) throws XdrException {
        super.xdrEncode(xdr);
        xdr.put_int(RpcReplyStats.MSG_ACCEPTED);
    }

}