/*
 * Copyright (c) 2026 Huawei Technologies Co., Ltd.
 * openGauss-tools-onlineMigration-mysql is licensed under Mulan PSL v2.
 * You can use this software according to the terms and conditions of the Mulan PSL v2.
 * You may obtain a copy of Mulan PSL v2 at:
 *          http://license.coscl.org.cn/MulanPSL2
 * THIS SOFTWARE IS PROVIDED ON AN "AS IS" BASIS, WITHOUT WARRANTIES OF ANY KIND,
 * EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO NON-INFRINGEMENT,
 * MERCHANTABILITY OR FIT FOR A PARTICULAR PURPOSE.
 * See the Mulan PSL v2 for more details.
 */

import org.junit.Test;

import java.sql.SQLException;

public class ReverseMigrationTest {
    @Test
    public void test() throws SQLException, InterruptedException {
        ReverseMigration.dropSlot();
        ReverseMigration.createSlot();
        ReverseMigration.startSlot();
    }
}
