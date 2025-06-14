# spring-app-caching-proxy
This is a Spring Boot-powered caching proxy server that forwards HTTP requests to a target origin, caches the responses in memory using Caffeine, and serves future requests instantly from cache. It adds headers like X-Cache: HIT/MISS and supports clearing the cache via CLI. Great for learning caching basics.
