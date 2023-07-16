package com.kunal.schedule.security.middle;

import com.kunal.schedule.backend.repository.MemberRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

@AllArgsConstructor
@Service
@RequestScope
@Transactional
public class UserDetailsServiceImpl implements UserDetailsService {

    private final MemberRepository memberRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        return memberRepository.findByName(userName)
                .orElseThrow(() -> new UsernameNotFoundException("User name not found: " + userName));
    }
}
