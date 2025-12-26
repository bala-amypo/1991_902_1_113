public class StudentProfile {

    private Long id;
    private String studentId;
    private Boolean repeatOffender = false;
    private LocalDateTime createdAt = LocalDateTime.now();

    private List<IntegrityCase> integrityCases = new ArrayList<>();

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Boolean getRepeatOffender() { return repeatOffender; }
    public void setRepeatOffender(Boolean repeatOffender) { this.repeatOffender = repeatOffender; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public List<IntegrityCase> getIntegrityCases() { return integrityCases; }
}
