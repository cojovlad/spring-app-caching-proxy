# spring-app-caching-proxy
Caching Proxy is a CLI‑driven proxy server built with Spring Boot and Caffeine. Launch it with --port and --origin to forward requests, cache full HTTP responses in memory, and mark them with X-Cache: MISS on first fetch or X-Cache: HIT on subsequent hits. Use --clear-cache to reset the cache.
