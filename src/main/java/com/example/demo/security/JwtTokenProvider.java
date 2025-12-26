public class JwtTokenProvider {

    private final String key;
    private final long expiry;

    public JwtTokenProvider(String key, long expiry) {
        this.key = key;
        this.expiry = expiry;
    }

    public String generateToken(Authentication auth, Long id, String email, String role) {
        return Jwts.builder()
            .setSubject(email)
            .claim("id", id)
            .claim("role", role)
            .setExpiration(new Date(System.currentTimeMillis() + expiry))
            .signWith(Keys.hmacShaKeyFor(key.getBytes()))
            .compact();
    }

    public String getUsernameFromToken(String token) {
        return Jwts.parserBuilder()
            .setSigningKey(key.getBytes())
            .build()
            .parseClaimsJws(token)
            .getBody()
            .getSubject();
    }

    public boolean validateToken(String token) {
        try {
            getUsernameFromToken(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
