public class IntegrityCase {

    private Long id;
    private String status = "OPEN";
    private LocalDateTime createdAt = LocalDateTime.now();

    private List<PenaltyAction> penalties = new ArrayList<>();

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public List<PenaltyAction> getPenalties() { return penalties; }
}
