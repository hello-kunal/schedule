package com.kunal.schedule.backend.middle;

import com.kunal.schedule.backend.repository.MemberRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

@Service
@RequiredArgsConstructor
@RequestScope
@Transactional
public class MemberProvider {

    private final MemberRepository memberRepository;
}
