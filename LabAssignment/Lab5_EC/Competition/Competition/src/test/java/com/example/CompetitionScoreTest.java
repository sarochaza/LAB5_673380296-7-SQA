package com.example;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * CP353201 Software Quality Assurance (1/2569)
 * Lab#5.2 – Equivalence class testing
 * Instructor: Asst.Prof. Chitsutha Soomlek
 * 
 * Student ID: 673380296-7
 * Name: นางสาวสโรชา เสาทอง
 */
public class CompetitionScoreTest {

    private CompetitionScore competitionScore;

    @BeforeEach
    void setUp() {
        competitionScore = new CompetitionScore();
    }

    
    // 1. Tests for findMaxScore(int, int, int)
    

    static Stream<Arguments> provideValidThreeScores() {
        return Stream.of(
            Arguments.of(400, 450, 200, 450),
            Arguments.of(0, 500, 250, 500)
        );
    }

    @ParameterizedTest
    @MethodSource("provideValidThreeScores")
    @DisplayName("Test findMaxScore(int, int, int) with valid scores")
    void testFindMaxScoreThreeArgsValid(int score1, int score2, int score3, int expectedMax) {
        int actual = competitionScore.findMaxScore(score1, score2, score3);
        assertEquals(expectedMax, actual);
    }

    static Stream<Arguments> provideInvalidThreeScores() {
        return Stream.of(
            Arguments.of(-10, 300, 400),
            Arguments.of(300, -5, 400),
            Arguments.of(300, 400, -1),
            Arguments.of(501, 300, 400),
            Arguments.of(300, 600, 400)
        );
    }

    @ParameterizedTest
    @MethodSource("provideInvalidThreeScores")
    @DisplayName("Test findMaxScore(int, int, int) with invalid scores should throw IllegalArgumentException")
    void testFindMaxScoreThreeArgsInvalid(int score1, int score2, int score3) {
        assertThrows(IllegalArgumentException.class, () -> {
            competitionScore.findMaxScore(score1, score2, score3);
        });
    }

 
    // 2. Tests for findMaxScore(int[] scores)
    

    static Stream<Arguments> provideValidArrayScores() {
        return Stream.of(
            Arguments.of(new int[]{100, 350, 250}, 350),
            Arguments.of(new int[]{0, 250, 500}, 500)
        );
    }

    @ParameterizedTest
    @MethodSource("provideValidArrayScores")
    @DisplayName("Test findMaxScore(int[]) with valid array elements")
    void testFindMaxScoreArrayValid(int[] scores, int expectedMax) {
        int actual = competitionScore.findMaxScore(scores);
        assertEquals(expectedMax, actual);
    }

    static Stream<Arguments> provideInvalidArrayScores() {
        return Stream.of(
            Arguments.of((Object) new int[]{-5, 300, 400}),
            Arguments.of((Object) new int[]{100, 550, 200}),
            Arguments.of((Object) new int[]{100, 200}),
            Arguments.of((Object) null)
        );
    }

    @ParameterizedTest
    @MethodSource("provideInvalidArrayScores")
    @DisplayName("Test findMaxScore(int[]) with invalid array or elements should throw IllegalArgumentException")
    void testFindMaxScoreArrayInvalid(int[] scores) {
        assertThrows(IllegalArgumentException.class, () -> {
            competitionScore.findMaxScore(scores);
        });
    }
}