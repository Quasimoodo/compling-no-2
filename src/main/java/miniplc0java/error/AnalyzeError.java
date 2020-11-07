package miniplc0java.error;

import miniplc0java.util.Pos;

public class AnalyzeError extends CompileError {
    private static final long serialVersionUID = 1L;

    ErrorCode code;
    Pos pos;
    String inf="";

    @Override
    public ErrorCode getErr() {
        return code;
    }

    @Override
    public Pos getPos() {
        return pos;
    }

    /**
     * @param errorToken
     * @param code
     * @param pos
     */
    public AnalyzeError(ErrorCode code, Pos pos) {
        this.code = code;
        this.pos = pos;
    }
    public AnalyzeError(ErrorCode code,Pos pos,String inf )
    {
        this.code=code;
        this.pos=pos;
        this.inf=inf;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Analyze Error: ").append(code).append(", at: ").append(pos).append(inf).toString();
    }
}
